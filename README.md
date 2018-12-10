# GlueEtlExample
This is an example of [AWS Glue] ETL. It will also using [AWS CodePipeline] and [AWS CloudFormation] to manage infrastructure and code deployment.

# Project plan:
1. Add Gradle support.
    ~~1. Auto create S3 bucket for infrastructure.~~
    ~~2. Auto build and package project.~~
    3. Auto upload jar to S3 bucket. (After adding ETL sample code)
2. Add infrastructure to manage code pipeline stack. TODO: add detail steps
3. Add infrastructure to manage glue stack. TODO: add detail steps
4. Add ETL sample code. TODO: add detail steps


[AWS Glue]: https://aws.amazon.com/glue/?sc_channel=PS&sc_campaign=acquisition_US&sc_publisher=google&sc_medium=ACQ-P%7CPS-GO%7CBrand%7CDesktop%7CSU%7CAnalytics%7CGlue%7CUS%7CEN%7CText&sc_content=glue_e&sc_detail=aws%20glue&sc_category=Analytics&sc_segment=293614961004&sc_matchtype=e&sc_country=US&s_kwcid=AL!4422!3!293614961004!e!!g!!aws%20glue&ef_id=CjwKCAiAl7PgBRBWEiwAzFhmmqxOsGTevmEzpO9ueWqJvmxvAgBFGw2xecp3aQX7QbPxw0cWigdJshoCl8YQAvD_BwE:G:s
[AWS CloudFormation]: https://aws.amazon.com/cloudformation/?sc_channel=PS&sc_campaign=acquisition_US&sc_publisher=google&sc_medium=ACQ-P%7CPS-GO%7CBrand%7CDesktop%7CSU%7CManagement%20Tools%7CCloudFormation%7CUS%7CEN%7CText&sc_content=cloudformation_e&sc_detail=aws%20cloudformation&sc_category=Management%20Tools&sc_segment=293650067978&sc_matchtype=e&sc_country=US&s_kwcid=AL!4422!3!293650067978!e!!g!!aws%20cloudformation&ef_id=CjwKCAiAl7PgBRBWEiwAzFhmmmETPug_0L15Bred8-HaGfjvd41g8Nda-QsQRK6Xe4bG98kQQbcHkRoC45cQAvD_BwE:G:s
[AWS CodePipeline]: https://aws.amazon.com/codepipeline/