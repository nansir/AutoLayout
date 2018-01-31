# AutoLayout 
Android屏幕适配方案,强迫症修改了包名去除了一些无效引用,增加了AutoCardView、AutoGridLayout、AutoTabLayout等重新打包了一遍[原文地址](https://github.com/hongyangAndroid/AndroidAutoLayout)
## 引入
 [ ![Download](https://api.bintray.com/packages/nansir/AndroidApplication/AutoLayout/images/download.svg?version=1.1.3) ](https://bintray.com/nansir/AndroidApplication/AutoLayout/1.1.3/link)
> compile 'com.sir.app:AutoLayout:1.1.3'

![4.7寸720*1280](https://github.com/nansir/AutoLayout/blob/master/sample/4-7.jpg)![5寸1080*1920](https://github.com/nansir/AutoLayout/blob/master/sample/5.jpg)![7寸1200*1920](https://github.com/nansir/AutoLayout/blob/master/sample/7.jpg)
## 用法
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
