package cn.v1.evc.cec.data;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/22
 * @Description: 查询充电站信息 (Req代表入参)
 */
public class ReqStation implements Serializable {

    private static final long serialVersionUID = -1512340038914887862L;

    public ReqStation(){}

    public ReqStation(Integer pageNo, Integer pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public ReqStation(String lastQueryTime, Integer pageNo, Integer pageSize) {
        this.lastQueryTime = lastQueryTime;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    @JSONField(name="LastQueryTime")
    private String lastQueryTime;  //上次查询日期 格式"yyyy-MM-dd HH:mm:ss"

    @JSONField(name="PageNo")
    private Integer pageNo;

    @JSONField(name="PageSize")
    private Integer pageSize;

    public String getLastQueryTime() {
        return lastQueryTime;
    }

    public void setLastQueryTime(String lastQueryTime) {
        this.lastQueryTime = lastQueryTime;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
