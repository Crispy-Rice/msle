package com.yuantu.service.orderservice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *@author tai
 *@Time
 *快递费用计算工具类
 *
 */
public class CalculationOfCharges {
    //计算包装费
    public Double calculatePackingCharge(Integer orderPackagingPaperquantity
            , Integer orderPackagingWoodenquantity, Integer orderPackagingBagquantity) {
        Double packingCharge = 0D;
        packingCharge = (double) (orderPackagingPaperquantity * 5
                + orderPackagingWoodenquantity * 10 + orderPackagingBagquantity * 1);
        return packingCharge;
    }

    //计算理论重量
    public Double calculateTheWeighingMode(Double orderCargoWeight, Double orderCargoBulk) {
        Integer  proportion=5000;
        if ((orderCargoBulk / proportion) > orderCargoWeight) {
            return orderCargoBulk / 5000;
        } else {
            return orderCargoWeight;
        }
    }

    //判别快递模式
    public Double judgeExpressWay(String orderExpresstype) {
        List<String>  expresstype=new ArrayList<String>();
        expresstype.set(1,"substantial");
        expresstype.set(2,"standard");
        expresstype.set(3,"posthaste");
        if (expresstype.get(1).equals(orderExpresstype)) {
            return 1D;
        } else if (expresstype.get(2).equals(orderExpresstype)) {
            return (double) (23 / 18);
        } else {
            return (double) (25 / 18);
        }
    }

    //计算运费
    public Double calculateCarriage(Double orderCargoWeight, Long constantDistance
            , Double orderCargoBulk, String orderExpresstype) {
        Double carriage = 0D;
        carriage = (double) ((constantDistance / 1000) * 23
                * calculateTheWeighingMode(orderCargoWeight, orderCargoBulk)
                * judgeExpressWay(orderExpresstype));
        return carriage;
    }

    //计算总价
    public Double getTotalPrice(Integer orderPackagingPaperquantity
            , Integer orderPackagingWoodenquantity, Integer orderPackagingBagquantity
            , Double orderCargoWeight, Long constantDistance, Double orderCargoBulk
            , String orderExpresstype) {
        Double totalPrice = 0D;
        totalPrice = calculateCarriage(orderCargoWeight
                , constantDistance, orderCargoBulk, orderExpresstype)
                + calculatePackingCharge(orderPackagingPaperquantity
                , orderPackagingWoodenquantity, orderPackagingBagquantity);
        return totalPrice;
    }

}
