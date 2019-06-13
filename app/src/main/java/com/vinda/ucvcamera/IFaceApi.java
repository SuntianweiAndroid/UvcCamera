package com.vinda.ucvcamera;

import com.vinda.ucvcamera.bean.ResponseData;
import com.vinda.ucvcamera.bean.ResultBeen;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * //                            _ooOoo_
 * //                           o8888888o
 * //                           88" . "88
 * //                           (| -_- |)
 * //                            O\ = /O
 * //                        ____/`---'\____
 * //                      .   ' \\| |// `.
 * //                       / \\||| : |||// \
 * //                     / _||||| -:- |||||- \
 * //                       | | \\\ - /// | |
 * //                     | \_| ''\---/'' | |
 * //                      \ .-\__ `-` ___/-. /
 * //                   ___`. .' /--.--\ `. . __
 * //                ."" '< `.___\_<|>_/___.' >'"".
 * //               | | : `- \`.;`\ _ /`;.`/ - ` : | |
 * //                 \ \ `-. \_ __\ /__ _/ .-` / /
 * //         ======`-.____`-.___\_____/___.-`____.-'======
 * //                            `=---='
 * //
 * //         .............................................
 * //                  佛祖镇楼                  BUG辟易
 *
 * @author :EchoXBR in  2018/12/25 下午4:02.
 * 功能描述:HTTP
 */
public interface IFaceApi {
    String ADD_TRADE = "aps/trade/addtrade.do";
    String UPLOAD_IMAGE = "faceController/interfaceUtil";

    /**
     * 人脸结果上传云平台
     *
     */
//    @FormUrlEncoded
//    @POST(ADD_TRADE)
//    Observable<String> addTrade(@FieldMap  HashMap<String ,Object> data);

    @FormUrlEncoded
    @POST(ADD_TRADE)
    Observable<ResponseData> addTrade(@Field("add") String data);

    @POST(UPLOAD_IMAGE)
    Observable<ResponseBody> uploadImage(@Body RequestBody requestBody);
//    @POST(UPLOAD_IMAGE)
//    Observable<ResultBeen> uploadImage(@Body RequestBody requestBody);
}
