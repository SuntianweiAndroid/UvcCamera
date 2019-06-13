package com.vinda.ucvcamera.bean;

import java.util.List;

public class test {


    /**
     * code : 000000
     * date : [{"idcard":"1341341141241","imageid":"5371653d-07a0-4c3f-ad31-604a35b3a1c8","name":"1241","password":"123456","phone":"12345","uuid":"3c94ccd2-3c26-478d-9962-efac160365c6"},{"idcard":"1341341141241","imageid":"77834c94-be67-4b53-a1dd-a05c4db480f6","name":"1241","password":"123456","phone":"12345","uuid":"a4ba57c9-7770-40fe-b8a0-210434bea25d"},{"idcard":"1341341141241","imageid":"e8763176-8090-49bd-bc66-ad20f32d5199","name":"1241","password":"123456","phone":"12345","uuid":"ee3fb9e9-699b-46c2-ba86-5ae85c54ab0f"}]
     * message : 校验通过
     */

    private String code;
    private String message;
    private List<DateBean> date;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DateBean> getDate() {
        return date;
    }

    public void setDate(List<DateBean> date) {
        this.date = date;
    }

    public static class DateBean {
        /**
         * idcard : 1341341141241
         * imageid : 5371653d-07a0-4c3f-ad31-604a35b3a1c8
         * name : 1241
         * password : 123456
         * phone : 12345
         * uuid : 3c94ccd2-3c26-478d-9962-efac160365c6
         */

        private String idcard;
        private String imageid;
        private String name;
        private String password;
        private String phone;
        private String uuid;

        public String getIdcard() {
            return idcard;
        }

        public void setIdcard(String idcard) {
            this.idcard = idcard;
        }

        public String getImageid() {
            return imageid;
        }

        public void setImageid(String imageid) {
            this.imageid = imageid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }
    }
}
