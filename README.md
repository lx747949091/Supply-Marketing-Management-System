# Supply-Marketing-Management-System
商品供销存管理系统 (JSP+SSM+MySQL+EasyUI)
首页
![image](https://github.com/michaelwuyu/Supply-Marketing-Management-System/blob/master/images/2.png)



模块|arouter-api|arouter-compiler|arouter-annotation|arouter-register
---|---|---|---|---
最新版本|[![Download](https://api.bintray.com/packages/zhi1ong/maven/arouter-api/images/download.svg)](https://bintray.com/zhi1ong/maven/arouter-api/_latestVersion)|[![Download](https://api.bintray.com/packages/zhi1ong/maven/arouter-compiler/images/download.svg)](https://bintray.com/zhi1ong/maven/arouter-compiler/_latestVersion)|[![Download](https://api.bintray.com/packages/zhi1ong/maven/arouter-annotation/images/download.svg)](https://bintray.com/zhi1ong/maven/arouter-annotation/_latestVersion)|[![Download](https://api.bintray.com/packages/zhi1ong/maven/arouter-register/images/download.svg)](https://bintray.com/zhi1ong/maven/arouter-register/_latestVersion)

#### Demo展示

##### [Demo apk下载](https://github.com/alibaba/ARouter/blob/develop/demo/arouter-demo.apk)、[Demo Gif](https://raw.githubusercontent.com/alibaba/ARouter/master/demo/arouter-demo.gif)

#### 一、功能介绍
1. **支持直接解析标准URL进行跳转，并自动注入参数到目标页面中**
2. **支持多模块工程使用**
3. **支持添加多个拦截器，自定义拦截顺序**
4. **支持依赖注入，可单独作为依赖注入框架使用**
5. **支持InstantRun**
6. **支持MultiDex**(Google方案)
7. 映射关系按组分类、多级管理，按需初始化
8. 支持用户指定全局降级与局部降级策略
9. 页面、拦截器、服务等组件均自动注册到框架
10. 支持多种方式配置转场动画 
11. 支持获取Fragment
12. 完全支持Kotlin以及混编(配置见文末 其他#5)
13. **支持第三方 App 加固**(使用 arouter-register 实现自动注册)

#### 二、典型应用
1. 从外部URL映射到内部页面，以及参数传递与解析
2. 跨模块页面跳转，模块间解耦
3. 拦截跳转过程，处理登陆、埋点等逻辑
4. 跨模块API调用，通过控制反转来做组件解耦
