除了使用maven compile外，也可以使用如下办法生成avro
avro提供了一个avro-tools包来生成java文件，可以通过下面命令：
java -jar /path/to/avro-tools-1.8.0.jar compile schema <schema file> <destination>