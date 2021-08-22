# Spring Boot project using AWS RDS and Secrets Manager

This is a sample project to demonstrate how to apply Amazon RDS, AWS Secrets Manager and AWS Secrets Manager JDBC Library to a Spring Boot project

Read more at blog post [Tích hợp Amazon RDS datasource vào Spring project dùng AWS Secrets Manager](https://luanvv.medium.com/t%C3%ADch-h%E1%BB%A3p-amazon-rds-datasource-v%C3%A0o-spring-project-d%C3%B9ng-aws-secrets-manager-1fcb75947770)

## Pre-requisites

A RDS instance up and running. A secret (AWS Secrets Manager) which stores the RDS instance's credentials.  
You can create both of them from Cloud Formation template, refer file [cf.yaml](cf.yaml)

Make sure your AWS environment is correct so your application is able to retrieve the secret from AWS Secrets Manager

## Configuration

Change in [application.yml](src/main/resources/application.yml) rds-endpoint and secret-name (RDSSecretsDemo if use my CloudFormation template)

```yml
spring:
  datasource:
    url: jdbc-secretsmanager:mysql://<rds-endpoint>:3306/aws
    username: <secret-name>
```

## Authors

* **Luan Vu** - [luanvuhlu](https://github.com/luanvuhlu)