package cn.v1.evc.cec.base;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: wr
 * @Date: 2018/11/22
 * @Description: 中电联常量定义
 */
public class CecConstant {

    //充电站点类型
    public static final Map<Integer,String> Cec_Station_Type = new HashMap<Integer, String>(){
        {
            put(1,"公共");
            put(50,"个人");
            put(100,"公共(专用)");
            put(101,"环卫(专用)");
            put(102,"物流(专用)");
            put(103,"出租车(专用)");
            put(255,"其它");
        }
    };

    //充电站点状态
    public static final Map<Integer,String> Cec_Station_Status = new HashMap<Integer, String>(){
        {
            put(0,"未知");
            put(1,"建设中");
            put(5,"关闭下线");
            put(6,"维护中");
            put(50,"正常使用");
        }
    };

    //充电站点建设场所
    public static final Map<Integer,String> Cec_Station_Construction = new HashMap<Integer, String>(){
        {
            put(1,"居民区");
            put(2,"公共机构");
            put(3,"企事业单位");
            put(4,"写字楼");
            put(5,"工业园区");
            put(6,"交通枢纽");
            put(7,"大型文体设备");
            put(8,"城市绿地");
            put(9,"大型建筑配建停车场");
            put(10,"路边停车位");
            put(11,"城际高速服务区");
            put(255,"其他");
        }
    };

    //充电设备类型
    public static final Map<Integer,String> Cec_Equipment_Type = new HashMap<Integer, String>(){
        {
            put(1,"直流设备");
            put(2,"交流设备");
            put(3,"交直流一体设备");
            put(4,"无线设备");
            put(5,"其它");
        }
    };

    //充电设备接口类型
    public static final Map<Integer,String> Cec_Connector_Type = new HashMap<Integer, String>(){
        {
            put(1,"家用插座");
            put(2,"交流接口插座");
            put(3,"交流接口插头");
            put(4,"直流接口枪头");
            put(5,"无线充电座");
            put(6,"其它");
        }
    };

    //充电设备接口状态
    public static final Map<Integer,String> Cec_Connector_Status = new HashMap<Integer, String>(){
        {
            put(0,"离网");
            put(1,"空闲");
            put(2,"占用未充电");
            put(3,"占用充电中");
            put(4,"占用预约锁定");
            put(255,"故障");
        }
    };

    //充电设备接口车位状态
    public static final Map<Integer,String> Cec_Park_Status = new HashMap<Integer, String>(){
        {
            put(0,"未知");
            put(10,"空闲");
            put(50,"占用");
        }
    };

    //充电设备接口地锁状态
    public static final Map<Integer,String> Cec_Lock_Status = new HashMap<Integer, String>(){
        {
            put(0,"未知");
            put(10,"已解锁");
            put(50,"已上锁");
        }
    };

}
