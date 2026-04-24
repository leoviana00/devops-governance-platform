pipelineJob('payment-service-pipeline') {

    description('Pipeline automática do payment-service')

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/leoviana00/payment-service.git')
                    }
                    branches('*/main')
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}