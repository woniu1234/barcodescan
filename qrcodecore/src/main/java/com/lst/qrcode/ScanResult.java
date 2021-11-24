package com.lst.qrcode;

import android.graphics.PointF;

/**
 * @author lst
 * @Description: 扫描结果(类描述)
 * @date 2021/11/24
 */
public class ScanResult {
    String result;
    PointF[] resultPoints;

    public ScanResult(String result) {
        this.result = result;
    }

    public ScanResult(String result, PointF[] resultPoints) {
        this.result = result;
        this.resultPoints = resultPoints;
    }
}
