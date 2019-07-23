import com.yuantu.po.MsleStaffPo;
import com.yuantu.serviceinterface.strategyinterface.IStrategyService;
import com.yuantu.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *@author tai
 *@Time
 *策略模块
 *
 */
@RestController
@RequestMapping(value = "/strategy")
public class StrategyController {
    @Autowired
    private IStrategyService iStaffService;

    /**
     获取所有员工信息
     */
    @RequestMapping(value = "/getAllUsers",method = RequestMethod.GET)
    public PageUtil<MsleStaffPo> getAllUsers (){
        PageUtil<MsleStaffPo> pageUtil=new PageUtil<MsleStaffPo>(
                iStaffService.geAllUsers());
        return   pageUtil;
    }

}