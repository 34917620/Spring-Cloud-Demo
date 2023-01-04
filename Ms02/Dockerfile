## 指定java 运行环境镜像

FROM docker.quant-cloud.cn/szly/centos7-jre1.8.0-351

LABEL maintainer="wangzhi@quant-cloud.com.cn"
LABEL useage="测试微服务2"

ARG install_dir=/usr/local

ADD ./Ms02-bundle-tar.tar.gz ${install_dir}/

WORKDIR ${install_dir}

EXPOSE 9184

ENTRYPOINT ["Ms02/bin/start-for-docker.sh"]