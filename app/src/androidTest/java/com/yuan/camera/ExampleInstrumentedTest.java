package com.yuan.camera;

import android.content.Context;
import android.os.Environment;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;
import android.util.Log;

import com.vinda.ucvcamera.FaceApi;
import com.vinda.ucvcamera.bean.ResultBeen;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.yuan.camera", appContext.getPackageName());
    }
    @Test
    public void upLoadImage() {

        if (TextUtils.isEmpty(Environment.getExternalStorageDirectory() + "/1559646775696test.jpg")) {
            return;
        }
        File file = new File(Environment.getExternalStorageDirectory(), "/1559646775696test.jpg");
        RequestBody fileBody = RequestBody.create(MediaType.parse("multipart/form-data"), file);
        RequestBody multipartBody = new MultipartBody.Builder()
                .setType(MultipartBody.ALTERNATIVE)
                .addFormDataPart("localTxnSeq", "1159")
                .addFormDataPart("txnAttr", "45")
                .addFormDataPart("posId", "123456")
                .addFormDataPart("imageData", "1559646775696test.jpg", fileBody)
                .addFormDataPart("txnamt", "123456")
                .addFormDataPart("txnDate", "20190604")
                .addFormDataPart("txnTime", "1143").build();
        Log.i("hainan", "上传");
        FaceApi.getInstance().uploadImage(multipartBody).subscribeOn(io.reactivex.schedulers.Schedulers.io())
                .observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ResponseBody resultBeen) {
                        System.out.println("onNext: " );
                        try {
                            System.out.println("onNext: " );
                            Log.i("hainan", "onNext: " + resultBeen.string().replace("\\\"", "'"));

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("hainan", "onError: " + e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
