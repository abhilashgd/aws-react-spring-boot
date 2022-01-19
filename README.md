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
        
        // upload user profile image
        // 1. check if image is not empty
        // 2. check if file is an image 
        // 3. check if user exists in our database
        // 4. Grab some metadata from file if any 
        // 5. Store the image in s3 and upate databse with s3 image link

# CREATING REACT APP
        
        https://github.com/facebook/create-react-app
        //Commands
        % npx create-react-app frontend //to create facebook react app
        
        
        

