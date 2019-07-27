package com.yuantu.controller;

        import com.yuantu.dao.IStaffDao;
        import com.yuantu.util.PageUtil;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RestController;
        import javax.annotation.Resource;
        import java.util.ArrayList;
        import java.util.List;

@RestController
@RequestMapping(value = "/login")
public class logincontroller {

    @Resource
    private IStaffDao iStaffDao;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public PageUtil<String> Login(String name, String psd){
        List<String> list=new ArrayList<String>();
        if (psd.equals(iStaffDao.getPasswordByName(name).getStaffPassword())){
            list.add(iStaffDao.getPasswordByName(name).getStaffPosition());
            PageUtil<String> pageUtil=new PageUtil<String>(list);
            return pageUtil;
        }else{
            list.add("false");
            PageUtil<String> pageUtil=new PageUtil<String>(list);
            return pageUtil;
        }
    }
}
