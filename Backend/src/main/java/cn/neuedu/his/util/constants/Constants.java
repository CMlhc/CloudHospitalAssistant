package cn.neuedu.his.util.constants;

/**
 *  通用常量类, 单个业务的常量请单开一个类, 方便常量的分类管理
 */
public class Constants {

    public static final String SUCCESS_CODE = "100";
    public static final String SUCCESS_MSG = "请求成功";
    //Token失效时间
    public static final Long EXPIRY_TIME = 1000 * 60 * 60L;  //过期时间1小时

//    public enum USER_TYPE {
//        CUSTOMER, RESTAURANT, COURIER;
//
//        USER_TYPE() {
//
//        }
//
//        public static USER_TYPE getUserType(String type) {
//            switch (type.toUpperCase()) {
//                case "CUSTOMER":
//                    return CUSTOMER;
//                case "RESTAURANT":
//                    return RESTAURANT;
//                case "COURIER":
//                    return COURIER;
//                default:
//                    return null;
//            }
//        }
//    }
}
