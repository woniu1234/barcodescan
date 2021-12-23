# barcodescan
使用步骤：
1、引入依赖：

api 'com.github.woniu1234:barcodescan:1.0.3'

2、创建扫描activity，
oncreate,代理扫描接口，QRCodeView.Delegate

zxingView.setDelegate(this)

public interface Delegate {
        /**
         * 处理扫描结果
         *
         * @param result 摄像头扫码时只要回调了该方法 result 就一定有值，不会为 null。解析本地图片或 Bitmap 时 result 可能为 null
         */
        void onScanQRCodeSuccess(String result);

        /**
         * 摄像头环境亮度发生变化
         *
         * @param isDark 是否变暗
         */
        void onCameraAmbientBrightnessChanged(boolean isDark);

        /**
         * 处理打开相机出错
         */
        void onScanQRCodeOpenCameraError();
}

onstop
zxingView.stopCamera()
ondestroy
zxingView.onDestroy()

在xml中
        <com.lst.qrcode.zxing.ZXingView
            android:id="@+id/zxing_view"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintTop_toBottomOf="@id/scan_top_bar"
            app:qrcv_animTime="1000"
            app:qrcv_barCodeTipText="将条码放入框内，即可自动扫描"
            app:qrcv_barcodeRectHeight="120dp"
            app:qrcv_borderColor="@android:color/white"
            app:qrcv_borderSize="1dp"
            app:qrcv_cornerColor="@color/theme_color"
            app:qrcv_cornerDisplayType="center"
            app:qrcv_cornerLength="20dp"
            app:qrcv_cornerSize="3dp"
            app:qrcv_customScanLineDrawable="@mipmap/scan_icon_scanline"
            app:qrcv_isAutoZoom="true"
            app:qrcv_isOnlyDecodeScanBoxArea="false"
            app:qrcv_isShowDefaultScanLineDrawable="true"
            app:qrcv_isShowLocationPoint="true"
            app:qrcv_isShowTipBackground="true"
            app:qrcv_isTipTextBelowRect="false"
            app:qrcv_maskColor="#33FFFFFF"
            app:qrcv_qrCodeTipText="将二维码放入框内，即可自动扫描"
            app:qrcv_rectWidth="200dp"
            app:qrcv_tipTextColor="@android:color/white"
            app:qrcv_tipTextSize="12sp"
            app:qrcv_toolbarHeight="56dp"
            app:qrcv_topOffset="65dp" />
            
 3、需要申请相机动态权限，如果要使用相册的话，申请文件权限
 这里使用的是。 pub.devrel:easypermissions:3.0.0
