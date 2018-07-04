# Easy learning 开发环境搭建指南

推荐使用IDE IntelliJ IDEA 2018+ 进行开发。以下是环境要求，在开发之前，请预先安装好

- Java: jdk 1.7或1.8
- MySQL: 5.6.x
- Maven: 构建工具，到[Maven官网](https://maven.apache.org/)下载最新版本即可。
- Tomcat: 因为使用Spring Boot框架，所以开发阶段不需要，部署阶段使用8.x
- Git: 不用说了，必须有，Linux一般自带，OSX和Windows需要手动下载

此外，在MySQL中，需要创建一个"el_dev_user"的用户，密码为"eldevelop1009"。项目需要数据库"easylearning"建议也预先创建好。

在MySQL root用户下，可以参考以下的命令:

```text
mysql> CREATE USER 'el_dev_user'@'localhost' IDENTIFIED BY 'eldevelop1009';
mysql> CREATE DATABASE easylearning;
mysql> GRANT ALL ON easylearning.* TO 'el_dev_user'@'localhost'
```

具备以上条件，您就可以进行Easy learning开发了。

在开发前，请先fork到自己的仓库，对代码进行修改并commit后pull request给我。

如果不清楚pull request的流程，可以参考[Git合作开发流程](https://www.cnblogs.com/schaepher/p/4933873.html)

不管您的电脑是什么系统，请打开IDEA IDE，在File选项中，有New一栏，New中选中"Project From Version Control",再选中"Git"。IDEA会要求您输入仓库的地址。这里输入github地址即可(注意是你fork出来的那个，不是我的)。

![Github](https://s1.ax1x.com/2018/07/04/PVp86x.png)

输入github地址和项目的本地路径，Clone前可以先test一下看看是否有效。

![Github](https://s1.ax1x.com/2018/07/04/PVpRAg.png)

随后等待clone，项目会自动导入。导入成功后，刷新maven下载依赖包即可。如果您之前没有进行过Spring开发，下载过程会比较长。

默认使用IDEA自带的Maven，强烈建议更换为自己的，参考[IDEA配置Maven](https://zhuanlan.zhihu.com/p/28133184)，并且可以添加国内的镜像加快下载速度，参考[更换Maven源](https://www.jianshu.com/p/4d5bb95b56c5)

以上就是基本的搭建教程，有问题直接联系我吧~
