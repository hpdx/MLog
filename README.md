# MLog
Android最简单好用的LOG输出库

在使用到MLog库的Module中的build.gradle文件里，添加以下依赖：
```
 allprojects {
    repositories {
        jcenter()

        maven {
            url 'https://dl.bintray.com/hpdx/maven/'
        }
    }
 }

 compile 'com.anbetter:MLog:1.0.1'
```

具体使用如下：
```
        // 设置LOG开关和全局Tag
        MLog.init(true, "MLog");

        // 使用全局Tag
        MLog.v("Hello World");
        MLog.i("Hello World");
        MLog.d("Hello World");
        MLog.e("Hello World");
        MLog.w("Hello World");

        // 使用局部Tag
        MLog.v("Test", "Hello World");
        MLog.i("Test", "Hello World");
        MLog.d("Test", "Hello World");
        MLog.e("Test", "Hello World");
        MLog.w("Test", "Hello World");
```