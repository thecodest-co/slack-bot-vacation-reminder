# holiday-reminder

This is plugin to our slack-bot named Cody. On second working day of every quarter it send reminder to people that have
more than 5 days of vacation. We use Calamari HR software as our data source.

## Configuration

You need these environment properties set:

* SLACK_TOKEN – token for slack bot. This is `xoxb` token that you can get from Slack application management console.
* CALAMARI_USERNAME – Calamari api username. In most cases it is `calamari`.
* CALAMARI_PASSWORD – Calamari api password. You can get it from your account configuration in Calamari.
* DAYS_LIMIT – minimal number of vacation days that trigger message.

## Building

Just run:

```bash
mvn clean verify
```

this will build application and docker image that can be pushed to repository like ECS.

## Running

By default this app works as AWS Lambda function and all deployment to AWS is handled by github actions.

### As jar

You need set up environment properties mentioned above and then:

```bash
java -jar target/holiday-reminder.jar
```

### As Docker image

You need to pass environment properties mentioned above to container:

```bash
docker run --rm -e SLACK_TOKEN=<SLACK_TOKEN> \
  -e CALAMARI_USERNAME=<CALAMARI_USERNAME> \
  -e CALAMARI_PASSWORD=<CALAMARI_PASSWORD> \
  -e DAYS_LIMIT=<DAYS_LIMIT> \
  --name holiday-reminder \
  -it holiday-reminder:latest
```

## AWS Configuration – requirements and deployment

Before you start you need to prepare your AWS services.

### Github

You need to set up some secrets:

- AWS_ACCESS_KEY_ID
- AWS_SECRET_ACCESS_KEY
- AWS_FUNCTION_ARN

### ECR 

Go to AWS ECR and create new repository:

```bash
aws ecr create-repository \
    --repository-name codest \
    --image-tag-mutability MUTABLE
```

Repository name should be the same as name in env var `ECR_REPOSITORY` in GH action file. 
Flag `MUTABLE` gives possibility to redeploy image with the same TAG.

Now you can run 

## TODO

- [x] AWS integration
- [ ] Optional integration with abstractapi.com to extends our working day calculation.
- [ ] Some clean up
- [x] Configure GH workflows.