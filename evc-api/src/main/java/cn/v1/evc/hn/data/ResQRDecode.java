package cn.v1.evc.hn.data;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: wr
 * @Date: 2018/11/14
 * @Description:二维码返回
 */
public class ResQRDecode implements Serializable {

    private static final long serialVersionUID = 5005490244183060947L;

    private String pid; //真实的充电桩 ID

    private String carportNo;  //充电桩所在的车位号

    private Long placeId; //充电桩所在充电点的 ID

    private String placeName ;  //充电桩所在充电点的名称

    private String requestSeq; //请求序号

    private Fee fee; //充电桩充电价格

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getCarportNo() {
        return carportNo;
    }

    public void setCarportNo(String carportNo) {
        this.carportNo = carportNo;
    }

    public Long getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getRequestSeq() {
        return requestSeq;
    }

    public void setRequestSeq(String requestSeq) {
        this.requestSeq = requestSeq;
    }

    public Fee getFee() {
        return fee;
    }

    public void setFee(Fee fee) {
        this.fee = fee;
    }

   public class Fee {
        private Double current;  //当前充电价格

        private Double serviceFee;  //服务费，各时段服务费都相同

        public Double getCurrent() {
            return current;
        }

        public void setCurrent(Double current) {
            this.current = current;
        }

        public Double getServiceFee() {
            return serviceFee;
        }

        public void setServiceFee(Double serviceFee) {
            this.serviceFee = serviceFee;
        }

        private List<Section> sections;

        public List<Section> getSections() {
            return sections;
        }

        public void setSections(List<Section> sections) {
            this.sections = sections;
        }

        //各时段充电价格定义
        public class Section{

            private Double fee; //该时段充电价格，包含服务费

            private Integer type;

            private String start;  //价格对应的开始时间

            private String end; //价格对应的结束时间

            public Double getFee() {
                return fee;
            }

            public void setFee(Double fee) {
                this.fee = fee;
            }

            public Integer getType() {
                return type;
            }

            public void setType(Integer type) {
                this.type = type;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }
    }
}
