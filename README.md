# aws-react-spring-boot
    
        https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/setup-project-gradle.html
        //aws java sdk dependency for gradle:
        implementation platform('com.amazonaws:aws-java-sdk-bom:1.11.1000')
        implementation 'com.amazonaws:aws-java-sdk-s3'

        AWS Credentials
        //login to --> aws.amazon.com -->profile-->security credentials
        -->access keys-->create new access key and download the key
        
        //Amazon s3 client
        goto-->services-->s3-->create new bucket-->
        abhilashgd-image-upload-123 --> create bucket

        //USER PROFILE CREATION and in - Memory database creation
        profile-->UserProfile.java
        datastore-->FakeUserProfileDataStore.java

        //API and Service Layers
        profile-->UserProfileDataAccessService
        profile-->UserProfileService
        profile-->UserProfileController

        //added git ignore to ignore config files
        gitignore refs--> https://git-scm.com/docs/gitignore

        //Run The application
        BROWSER: http://localhost:8080/api/v1/user-profile //should display fake in memory DB users



        

