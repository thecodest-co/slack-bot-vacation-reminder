# holiday-reminder

This is plugin to our slack-bot named Cody. On second working day of every quarter it send reminder to people that have
more than 5 days of vacation. We use Calamari HR software as our data source. 

## Configuration 

You need these three environment properties set: 

 * SLACK-TOKEN – token for slack bot. This is `xoxb` token that you can get from Slack application management console. 
 * CALAMARI-USERNAME – Calamari api username. In most cases it is `calamari`.
 * CALAMARI-PASSWORD – Calamari api password. You can get it from your account configuration in Calamari.

## TODO

 * AWS integration 
 * Optional integration with abstractapi.com to extends our working day calculation.
 * Some clean up
 * Configure GH workflows.