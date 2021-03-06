/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model;

/**
 * <p>
 * A complex type that describes how CloudFront processes requests. You can create up to 10 cache behaviors.You must create at least as many cache
 * behaviors (including the default cache behavior) as you have origins if you want CloudFront to distribute objects from all of the origins. Each cache
 * behavior specifies the one origin from which you want CloudFront to get objects. If you have two origins and only the default cache behavior, the
 * default cache behavior will cause CloudFront to get objects from one of the origins, but the other origin will never be used. If you don't want to
 * specify any cache behaviors, include only an empty CacheBehaviors element. Don't include an empty CacheBehavior element, or CloudFront returns a
 * MalformedXML error. To delete all cache behaviors in an existing distribution, update the distribution configuration and include only an empty
 * CacheBehaviors element. To add, change, or remove one or more cache behaviors, update the distribution configuration and specify all of the cache
 * behaviors that you want to include in the updated distribution.
 * </p>
 */
public class CacheBehavior {

    /**
     * The pattern (for example, images/*.jpg) that specifies which requests
     * you want this cache behavior to apply to. When CloudFront receives an
     * end-user request, the requested path is compared with path patterns in
     * the order in which cache behaviors are listed in the distribution. The
     * path pattern for the default cache behavior is * and cannot be
     * changed. If the request for an object does not match the path pattern
     * for any cache behaviors, CloudFront applies the behavior in the
     * default cache behavior.
     */
    private String pathPattern;

    /**
     * The value of ID for the origin that you want CloudFront to route
     * requests to when a request matches the path pattern either for a cache
     * behavior or for the default cache behavior.
     */
    private String targetOriginId;

    /**
     * A complex type that specifies how CloudFront handles query strings.
     */
    private ForwardedValues forwardedValues;

    /**
     * A complex type that specifies the AWS accounts, if any, that you want
     * to allow to create signed URLs for private content. If you want to
     * require signed URLs in requests for objects in the target origin that
     * match the PathPattern for this cache behavior, specify true for
     * Enabled, and specify the applicable values for Quantity and Items. For
     * more information, go to Using a Signed URL to Serve Private Content in
     * the Amazon CloudFront Developer Guide. If you don't want to require
     * signed URLs in requests for objects that match PathPattern, specify
     * false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     * remove one or more trusted signers, change Enabled to true (if it's
     * currently false), change Quantity as applicable, and specify all of
     * the trusted signers that you want to include in the updated
     * distribution.
     */
    private TrustedSigners trustedSigners;

    /**
     * Use this element to specify the protocol that users can use to access
     * the files in the origin specified by TargetOriginId when a request
     * matches the path pattern in PathPattern. If you want CloudFront to
     * allow end users to use any available protocol, specify allow-all. If
     * you want CloudFront to require HTTPS, specify https.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow-all, https-only
     */
    private String viewerProtocolPolicy;

    /**
     * The minimum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront queries your origin to see whether the object
     * has been updated.You can specify a value from 0 to 3,153,600,000
     * seconds (100 years).
     */
    private Long minTTL;

    /**
     * The pattern (for example, images/*.jpg) that specifies which requests
     * you want this cache behavior to apply to. When CloudFront receives an
     * end-user request, the requested path is compared with path patterns in
     * the order in which cache behaviors are listed in the distribution. The
     * path pattern for the default cache behavior is * and cannot be
     * changed. If the request for an object does not match the path pattern
     * for any cache behaviors, CloudFront applies the behavior in the
     * default cache behavior.
     *
     * @return The pattern (for example, images/*.jpg) that specifies which requests
     *         you want this cache behavior to apply to. When CloudFront receives an
     *         end-user request, the requested path is compared with path patterns in
     *         the order in which cache behaviors are listed in the distribution. The
     *         path pattern for the default cache behavior is * and cannot be
     *         changed. If the request for an object does not match the path pattern
     *         for any cache behaviors, CloudFront applies the behavior in the
     *         default cache behavior.
     */
    public String getPathPattern() {
        return pathPattern;
    }
    
    /**
     * The pattern (for example, images/*.jpg) that specifies which requests
     * you want this cache behavior to apply to. When CloudFront receives an
     * end-user request, the requested path is compared with path patterns in
     * the order in which cache behaviors are listed in the distribution. The
     * path pattern for the default cache behavior is * and cannot be
     * changed. If the request for an object does not match the path pattern
     * for any cache behaviors, CloudFront applies the behavior in the
     * default cache behavior.
     *
     * @param pathPattern The pattern (for example, images/*.jpg) that specifies which requests
     *         you want this cache behavior to apply to. When CloudFront receives an
     *         end-user request, the requested path is compared with path patterns in
     *         the order in which cache behaviors are listed in the distribution. The
     *         path pattern for the default cache behavior is * and cannot be
     *         changed. If the request for an object does not match the path pattern
     *         for any cache behaviors, CloudFront applies the behavior in the
     *         default cache behavior.
     */
    public void setPathPattern(String pathPattern) {
        this.pathPattern = pathPattern;
    }
    
    /**
     * The pattern (for example, images/*.jpg) that specifies which requests
     * you want this cache behavior to apply to. When CloudFront receives an
     * end-user request, the requested path is compared with path patterns in
     * the order in which cache behaviors are listed in the distribution. The
     * path pattern for the default cache behavior is * and cannot be
     * changed. If the request for an object does not match the path pattern
     * for any cache behaviors, CloudFront applies the behavior in the
     * default cache behavior.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pathPattern The pattern (for example, images/*.jpg) that specifies which requests
     *         you want this cache behavior to apply to. When CloudFront receives an
     *         end-user request, the requested path is compared with path patterns in
     *         the order in which cache behaviors are listed in the distribution. The
     *         path pattern for the default cache behavior is * and cannot be
     *         changed. If the request for an object does not match the path pattern
     *         for any cache behaviors, CloudFront applies the behavior in the
     *         default cache behavior.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheBehavior withPathPattern(String pathPattern) {
        this.pathPattern = pathPattern;
        return this;
    }
    
    
    /**
     * The value of ID for the origin that you want CloudFront to route
     * requests to when a request matches the path pattern either for a cache
     * behavior or for the default cache behavior.
     *
     * @return The value of ID for the origin that you want CloudFront to route
     *         requests to when a request matches the path pattern either for a cache
     *         behavior or for the default cache behavior.
     */
    public String getTargetOriginId() {
        return targetOriginId;
    }
    
    /**
     * The value of ID for the origin that you want CloudFront to route
     * requests to when a request matches the path pattern either for a cache
     * behavior or for the default cache behavior.
     *
     * @param targetOriginId The value of ID for the origin that you want CloudFront to route
     *         requests to when a request matches the path pattern either for a cache
     *         behavior or for the default cache behavior.
     */
    public void setTargetOriginId(String targetOriginId) {
        this.targetOriginId = targetOriginId;
    }
    
    /**
     * The value of ID for the origin that you want CloudFront to route
     * requests to when a request matches the path pattern either for a cache
     * behavior or for the default cache behavior.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetOriginId The value of ID for the origin that you want CloudFront to route
     *         requests to when a request matches the path pattern either for a cache
     *         behavior or for the default cache behavior.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheBehavior withTargetOriginId(String targetOriginId) {
        this.targetOriginId = targetOriginId;
        return this;
    }
    
    
    /**
     * A complex type that specifies how CloudFront handles query strings.
     *
     * @return A complex type that specifies how CloudFront handles query strings.
     */
    public ForwardedValues getForwardedValues() {
        return forwardedValues;
    }
    
    /**
     * A complex type that specifies how CloudFront handles query strings.
     *
     * @param forwardedValues A complex type that specifies how CloudFront handles query strings.
     */
    public void setForwardedValues(ForwardedValues forwardedValues) {
        this.forwardedValues = forwardedValues;
    }
    
    /**
     * A complex type that specifies how CloudFront handles query strings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param forwardedValues A complex type that specifies how CloudFront handles query strings.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheBehavior withForwardedValues(ForwardedValues forwardedValues) {
        this.forwardedValues = forwardedValues;
        return this;
    }
    
    
    /**
     * A complex type that specifies the AWS accounts, if any, that you want
     * to allow to create signed URLs for private content. If you want to
     * require signed URLs in requests for objects in the target origin that
     * match the PathPattern for this cache behavior, specify true for
     * Enabled, and specify the applicable values for Quantity and Items. For
     * more information, go to Using a Signed URL to Serve Private Content in
     * the Amazon CloudFront Developer Guide. If you don't want to require
     * signed URLs in requests for objects that match PathPattern, specify
     * false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     * remove one or more trusted signers, change Enabled to true (if it's
     * currently false), change Quantity as applicable, and specify all of
     * the trusted signers that you want to include in the updated
     * distribution.
     *
     * @return A complex type that specifies the AWS accounts, if any, that you want
     *         to allow to create signed URLs for private content. If you want to
     *         require signed URLs in requests for objects in the target origin that
     *         match the PathPattern for this cache behavior, specify true for
     *         Enabled, and specify the applicable values for Quantity and Items. For
     *         more information, go to Using a Signed URL to Serve Private Content in
     *         the Amazon CloudFront Developer Guide. If you don't want to require
     *         signed URLs in requests for objects that match PathPattern, specify
     *         false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     *         remove one or more trusted signers, change Enabled to true (if it's
     *         currently false), change Quantity as applicable, and specify all of
     *         the trusted signers that you want to include in the updated
     *         distribution.
     */
    public TrustedSigners getTrustedSigners() {
        return trustedSigners;
    }
    
    /**
     * A complex type that specifies the AWS accounts, if any, that you want
     * to allow to create signed URLs for private content. If you want to
     * require signed URLs in requests for objects in the target origin that
     * match the PathPattern for this cache behavior, specify true for
     * Enabled, and specify the applicable values for Quantity and Items. For
     * more information, go to Using a Signed URL to Serve Private Content in
     * the Amazon CloudFront Developer Guide. If you don't want to require
     * signed URLs in requests for objects that match PathPattern, specify
     * false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     * remove one or more trusted signers, change Enabled to true (if it's
     * currently false), change Quantity as applicable, and specify all of
     * the trusted signers that you want to include in the updated
     * distribution.
     *
     * @param trustedSigners A complex type that specifies the AWS accounts, if any, that you want
     *         to allow to create signed URLs for private content. If you want to
     *         require signed URLs in requests for objects in the target origin that
     *         match the PathPattern for this cache behavior, specify true for
     *         Enabled, and specify the applicable values for Quantity and Items. For
     *         more information, go to Using a Signed URL to Serve Private Content in
     *         the Amazon CloudFront Developer Guide. If you don't want to require
     *         signed URLs in requests for objects that match PathPattern, specify
     *         false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     *         remove one or more trusted signers, change Enabled to true (if it's
     *         currently false), change Quantity as applicable, and specify all of
     *         the trusted signers that you want to include in the updated
     *         distribution.
     */
    public void setTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
    }
    
    /**
     * A complex type that specifies the AWS accounts, if any, that you want
     * to allow to create signed URLs for private content. If you want to
     * require signed URLs in requests for objects in the target origin that
     * match the PathPattern for this cache behavior, specify true for
     * Enabled, and specify the applicable values for Quantity and Items. For
     * more information, go to Using a Signed URL to Serve Private Content in
     * the Amazon CloudFront Developer Guide. If you don't want to require
     * signed URLs in requests for objects that match PathPattern, specify
     * false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     * remove one or more trusted signers, change Enabled to true (if it's
     * currently false), change Quantity as applicable, and specify all of
     * the trusted signers that you want to include in the updated
     * distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trustedSigners A complex type that specifies the AWS accounts, if any, that you want
     *         to allow to create signed URLs for private content. If you want to
     *         require signed URLs in requests for objects in the target origin that
     *         match the PathPattern for this cache behavior, specify true for
     *         Enabled, and specify the applicable values for Quantity and Items. For
     *         more information, go to Using a Signed URL to Serve Private Content in
     *         the Amazon CloudFront Developer Guide. If you don't want to require
     *         signed URLs in requests for objects that match PathPattern, specify
     *         false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     *         remove one or more trusted signers, change Enabled to true (if it's
     *         currently false), change Quantity as applicable, and specify all of
     *         the trusted signers that you want to include in the updated
     *         distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheBehavior withTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
        return this;
    }
    
    
    /**
     * Use this element to specify the protocol that users can use to access
     * the files in the origin specified by TargetOriginId when a request
     * matches the path pattern in PathPattern. If you want CloudFront to
     * allow end users to use any available protocol, specify allow-all. If
     * you want CloudFront to require HTTPS, specify https.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow-all, https-only
     *
     * @return Use this element to specify the protocol that users can use to access
     *         the files in the origin specified by TargetOriginId when a request
     *         matches the path pattern in PathPattern. If you want CloudFront to
     *         allow end users to use any available protocol, specify allow-all. If
     *         you want CloudFront to require HTTPS, specify https.
     *
     * @see ViewerProtocolPolicy
     */
    public String getViewerProtocolPolicy() {
        return viewerProtocolPolicy;
    }
    
    /**
     * Use this element to specify the protocol that users can use to access
     * the files in the origin specified by TargetOriginId when a request
     * matches the path pattern in PathPattern. If you want CloudFront to
     * allow end users to use any available protocol, specify allow-all. If
     * you want CloudFront to require HTTPS, specify https.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow-all, https-only
     *
     * @param viewerProtocolPolicy Use this element to specify the protocol that users can use to access
     *         the files in the origin specified by TargetOriginId when a request
     *         matches the path pattern in PathPattern. If you want CloudFront to
     *         allow end users to use any available protocol, specify allow-all. If
     *         you want CloudFront to require HTTPS, specify https.
     *
     * @see ViewerProtocolPolicy
     */
    public void setViewerProtocolPolicy(String viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy;
    }
    
    /**
     * Use this element to specify the protocol that users can use to access
     * the files in the origin specified by TargetOriginId when a request
     * matches the path pattern in PathPattern. If you want CloudFront to
     * allow end users to use any available protocol, specify allow-all. If
     * you want CloudFront to require HTTPS, specify https.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow-all, https-only
     *
     * @param viewerProtocolPolicy Use this element to specify the protocol that users can use to access
     *         the files in the origin specified by TargetOriginId when a request
     *         matches the path pattern in PathPattern. If you want CloudFront to
     *         allow end users to use any available protocol, specify allow-all. If
     *         you want CloudFront to require HTTPS, specify https.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ViewerProtocolPolicy
     */
    public CacheBehavior withViewerProtocolPolicy(String viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy;
        return this;
    }
    
    
    /**
     * Use this element to specify the protocol that users can use to access
     * the files in the origin specified by TargetOriginId when a request
     * matches the path pattern in PathPattern. If you want CloudFront to
     * allow end users to use any available protocol, specify allow-all. If
     * you want CloudFront to require HTTPS, specify https.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow-all, https-only
     *
     * @param viewerProtocolPolicy Use this element to specify the protocol that users can use to access
     *         the files in the origin specified by TargetOriginId when a request
     *         matches the path pattern in PathPattern. If you want CloudFront to
     *         allow end users to use any available protocol, specify allow-all. If
     *         you want CloudFront to require HTTPS, specify https.
     *
     * @see ViewerProtocolPolicy
     */
    public void setViewerProtocolPolicy(ViewerProtocolPolicy viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy.toString();
    }
    
    /**
     * Use this element to specify the protocol that users can use to access
     * the files in the origin specified by TargetOriginId when a request
     * matches the path pattern in PathPattern. If you want CloudFront to
     * allow end users to use any available protocol, specify allow-all. If
     * you want CloudFront to require HTTPS, specify https.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow-all, https-only
     *
     * @param viewerProtocolPolicy Use this element to specify the protocol that users can use to access
     *         the files in the origin specified by TargetOriginId when a request
     *         matches the path pattern in PathPattern. If you want CloudFront to
     *         allow end users to use any available protocol, specify allow-all. If
     *         you want CloudFront to require HTTPS, specify https.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ViewerProtocolPolicy
     */
    public CacheBehavior withViewerProtocolPolicy(ViewerProtocolPolicy viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy.toString();
        return this;
    }
    
    /**
     * The minimum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront queries your origin to see whether the object
     * has been updated.You can specify a value from 0 to 3,153,600,000
     * seconds (100 years).
     *
     * @return The minimum amount of time that you want objects to stay in CloudFront
     *         caches before CloudFront queries your origin to see whether the object
     *         has been updated.You can specify a value from 0 to 3,153,600,000
     *         seconds (100 years).
     */
    public Long getMinTTL() {
        return minTTL;
    }
    
    /**
     * The minimum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront queries your origin to see whether the object
     * has been updated.You can specify a value from 0 to 3,153,600,000
     * seconds (100 years).
     *
     * @param minTTL The minimum amount of time that you want objects to stay in CloudFront
     *         caches before CloudFront queries your origin to see whether the object
     *         has been updated.You can specify a value from 0 to 3,153,600,000
     *         seconds (100 years).
     */
    public void setMinTTL(Long minTTL) {
        this.minTTL = minTTL;
    }
    
    /**
     * The minimum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront queries your origin to see whether the object
     * has been updated.You can specify a value from 0 to 3,153,600,000
     * seconds (100 years).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minTTL The minimum amount of time that you want objects to stay in CloudFront
     *         caches before CloudFront queries your origin to see whether the object
     *         has been updated.You can specify a value from 0 to 3,153,600,000
     *         seconds (100 years).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheBehavior withMinTTL(Long minTTL) {
        this.minTTL = minTTL;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (pathPattern != null) sb.append("PathPattern: " + pathPattern + ", ");
        if (targetOriginId != null) sb.append("TargetOriginId: " + targetOriginId + ", ");
        if (forwardedValues != null) sb.append("ForwardedValues: " + forwardedValues + ", ");
        if (trustedSigners != null) sb.append("TrustedSigners: " + trustedSigners + ", ");
        if (viewerProtocolPolicy != null) sb.append("ViewerProtocolPolicy: " + viewerProtocolPolicy + ", ");
        if (minTTL != null) sb.append("MinTTL: " + minTTL + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPathPattern() == null) ? 0 : getPathPattern().hashCode()); 
        hashCode = prime * hashCode + ((getTargetOriginId() == null) ? 0 : getTargetOriginId().hashCode()); 
        hashCode = prime * hashCode + ((getForwardedValues() == null) ? 0 : getForwardedValues().hashCode()); 
        hashCode = prime * hashCode + ((getTrustedSigners() == null) ? 0 : getTrustedSigners().hashCode()); 
        hashCode = prime * hashCode + ((getViewerProtocolPolicy() == null) ? 0 : getViewerProtocolPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getMinTTL() == null) ? 0 : getMinTTL().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CacheBehavior == false) return false;
        CacheBehavior other = (CacheBehavior)obj;
        
        if (other.getPathPattern() == null ^ this.getPathPattern() == null) return false;
        if (other.getPathPattern() != null && other.getPathPattern().equals(this.getPathPattern()) == false) return false; 
        if (other.getTargetOriginId() == null ^ this.getTargetOriginId() == null) return false;
        if (other.getTargetOriginId() != null && other.getTargetOriginId().equals(this.getTargetOriginId()) == false) return false; 
        if (other.getForwardedValues() == null ^ this.getForwardedValues() == null) return false;
        if (other.getForwardedValues() != null && other.getForwardedValues().equals(this.getForwardedValues()) == false) return false; 
        if (other.getTrustedSigners() == null ^ this.getTrustedSigners() == null) return false;
        if (other.getTrustedSigners() != null && other.getTrustedSigners().equals(this.getTrustedSigners()) == false) return false; 
        if (other.getViewerProtocolPolicy() == null ^ this.getViewerProtocolPolicy() == null) return false;
        if (other.getViewerProtocolPolicy() != null && other.getViewerProtocolPolicy().equals(this.getViewerProtocolPolicy()) == false) return false; 
        if (other.getMinTTL() == null ^ this.getMinTTL() == null) return false;
        if (other.getMinTTL() != null && other.getMinTTL().equals(this.getMinTTL()) == false) return false; 
        return true;
    }
    
}
    