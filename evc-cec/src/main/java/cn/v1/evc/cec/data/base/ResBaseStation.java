package cn.v1.evc.cec.data.base;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: wr
 * @Date: 2018/11/22
 * @Description: 查询充电站基础信息 (Res代表返参)
 */
public abstract class ResBaseStation<T> implements Serializable {

    private static final long serialVersionUID = -4296016870272086753L;

    private Integer pageNo; //当前页数

    private Integer pageCount; //页码总数

    private Integer itemSize;  //总记录数

    private List<T> stationInfos; //充电站信息列表

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getItemSize() {
        return itemSize;
    }

    public void setItemSize(Integer itemSize) {
        this.itemSize = itemSize;
    }

    public List<T> getStationInfos() {
        return stationInfos;
    }

    public void setStationInfos(List<T> stationInfos) {
        this.stationInfos = stationInfos;
    }
}
