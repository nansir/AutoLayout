# AutoLayout
Android屏幕适配方案,强迫症修改了包名去除了一些无效引用,重新打包了一遍[原文地址](https://github.com/hongyangAndroid/AndroidAutoLayout)
## 引入
> compile 'com.sir.app:AutoLayout:1.0'
## 用法
### 第一步
AndroidManifest中注明你的设计稿的尺寸

	 <!--UI设计的尺寸-->
        <meta-data
            android:name="design_width"
            android:value="1080"></meta-data>

        <meta-data
            android:name="design_height"
            android:value="1920"></meta-data>
### 第二步

	 把你的activity继承AutoLayoutActivity
## 更多详情
 [原文地址](https://github.com/hongyangAndroid/AndroidAutoLayout)
 
## 鸣谢
-  [hongyangAndroid](https://github.com/hongyangAndroid)
