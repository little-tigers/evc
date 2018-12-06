package cn.v1.evc.service.core;

import cn.v1.evc.cec.data.ReqStation;
import cn.v1.evc.cec.data.ResData;
import cn.v1.evc.factory.AbstractPhQuery;
import cn.v1.evc.ph.data.ResPhStation;
import cn.v1.evc.ph.data.ResPhStationInfo;
import cn.v1.evc.service.EvChargeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: wr
 * @Date: 2018/11/23
 * @Description:
 */
@Service("phChargeService")
public class PhChargeServiceImpl extends AbstractPhQuery implements EvChargeService  {

    //重写父类
    @Override
    public ResData<ResPhStation> queryStation(ReqStation reqStation){
        this.setZClass(ResPhStation.class);
        reqStation.setPageNo(1);
        reqStation.setPageSize(200);
        ResData<ResPhStation> resData = super.queryStation(reqStation);
        if(resData != null && "0".equals(resData.getRet())){
            ResPhStation resPhStation = resData.getData();
            //获取
            List<ResPhStationInfo> phStationInfoList = resPhStation.getStationInfos();
            //总页数
            Integer pageCount = resPhStation.getPageCount();
            //当前页数
            Integer pageNo = resPhStation.getPageNo();

            boolean flag = false;
            if (pageCount>pageNo){
                flag = true;
            }
            Integer pageSize = reqStation.getPageSize();
            //由于各运营商返回数据限制，需再次请求
            while (flag){
                flag = false;
                reqStation.setPageNo(reqStation.getPageNo()+1);
                reqStation.setPageSize(pageSize);
                ResData<ResPhStation> resData1 = super.queryStation(reqStation);
                if(resData1 != null && "0".equals(resData1.getRet())){
                    ResPhStation resPhStation1 = resData1.getData();
                    List<ResPhStationInfo> list = resPhStation1.getStationInfos();
                    if(list != null && list.size()>0){
                        //合并list
                        phStationInfoList.addAll(list);
                        //如果分页数小于或等于当前页，表示后面已无数据
                        if(resPhStation1.getPageCount() > resPhStation1.getPageNo()){
                            flag = true;
                        }
                    }
                }
            }
        }
        return resData;
    }
}
