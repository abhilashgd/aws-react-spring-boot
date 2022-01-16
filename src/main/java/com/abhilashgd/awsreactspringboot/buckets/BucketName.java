package com.abhilashgd.awsreactspringboot.buckets;

/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 1/17/22
 */
public enum BucketName {
    PROFILE_IMAGE("abhilashgd-image-upload-123");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
