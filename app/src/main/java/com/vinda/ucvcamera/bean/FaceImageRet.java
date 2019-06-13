package com.vinda.ucvcamera.bean;

import java.util.List;

public class FaceImageRet {


    /**
     * code : 000000
     * date : [{"idcard":"11011119908","imageid":"58620f89-e167-4655-b5e0-f9071a7790a3","name":"孙天伟","password":"12345678","phone":"13910211234","photourl":"/www/server/tomcat/webapps/mvc_shiro//uploadFile/cache_1559642381547.jpg","uuid":"7be3bf8e-ada8-41d2-bbca-8fc0d09aa239"}]
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
         * idcard : 11011119908
         * imageid : 58620f89-e167-4655-b5e0-f9071a7790a3
         * name : 孙天伟
         * password : 12345678
         * phone : 13910211234
         * photourl : /www/server/tomcat/webapps/mvc_shiro//uploadFile/cache_1559642381547.jpg
         * uuid : 7be3bf8e-ada8-41d2-bbca-8fc0d09aa239
         */

        private String idcard;
        private String imageid;
        private String name;
        private String password;
        private String phone;
        private String photourl;
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

        public String getPhotourl() {
            return photourl;
        }

        public void setPhotourl(String photourl) {
            this.photourl = photourl;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }
    }
}
