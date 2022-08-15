/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds a user to a channel. The <code>InvitedBy</code> field in
 * <code>ChannelMembership</code> is derived from the request header. A channel
 * member can:
 * </p>
 * <ul>
 * <li>
 * <p>
 * List messages
 * </p>
 * </li>
 * <li>
 * <p>
 * Send messages
 * </p>
 * </li>
 * <li>
 * <p>
 * Receive messages
 * </p>
 * </li>
 * <li>
 * <p>
 * Edit their own messages
 * </p>
 * </li>
 * <li>
 * <p>
 * Leave the channel
 * </p>
 * </li>
 * </ul>
 * <p>
 * Privacy settings impact this action as follows:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Public Channels: You do not need to be a member to list messages, but you
 * must be a member to send messages.
 * </p>
 * </li>
 * <li>
 * <p>
 * Private Channels: You must be a member to list or send messages.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
 * <code>AppInstanceUserArn</code> of the user that makes the API call as the
 * value in the header.
 * </p>
 * </note>
 */
public class CreateChannelMembershipRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the channel to which you're adding users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String channelArn;

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the member you want to add to the
     * channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String memberArn;

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or
     * <code>HIDDEN</code>. Default members are always returned as part of
     * <code>ListChannelMemberships</code>. Hidden members are only returned if
     * the type filter in <code>ListChannelMemberships</code> equals
     * <code>HIDDEN</code>. Otherwise hidden members are not returned. This is
     * only supported by moderators.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     */
    private String type;

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String chimeBearer;

    /**
     * <p>
     * The ID of the SubChannel in the request.
     * </p>
     * <note>
     * <p>
     * Only required when creating membership in a SubChannel for a moderator in
     * an elastic channel.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     */
    private String subChannelId;

    /**
     * <p>
     * The ARN of the channel to which you're adding users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the channel to which you're adding users.
     *         </p>
     */
    public String getChannelArn() {
        return channelArn;
    }

    /**
     * <p>
     * The ARN of the channel to which you're adding users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param channelArn <p>
     *            The ARN of the channel to which you're adding users.
     *            </p>
     */
    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel to which you're adding users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param channelArn <p>
     *            The ARN of the channel to which you're adding users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelMembershipRequest withChannelArn(String channelArn) {
        this.channelArn = channelArn;
        return this;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the member you want to add to the
     * channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The <code>AppInstanceUserArn</code> of the member you want to add
     *         to the channel.
     *         </p>
     */
    public String getMemberArn() {
        return memberArn;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the member you want to add to the
     * channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param memberArn <p>
     *            The <code>AppInstanceUserArn</code> of the member you want to
     *            add to the channel.
     *            </p>
     */
    public void setMemberArn(String memberArn) {
        this.memberArn = memberArn;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the member you want to add to the
     * channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param memberArn <p>
     *            The <code>AppInstanceUserArn</code> of the member you want to
     *            add to the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelMembershipRequest withMemberArn(String memberArn) {
        this.memberArn = memberArn;
        return this;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or
     * <code>HIDDEN</code>. Default members are always returned as part of
     * <code>ListChannelMemberships</code>. Hidden members are only returned if
     * the type filter in <code>ListChannelMemberships</code> equals
     * <code>HIDDEN</code>. Otherwise hidden members are not returned. This is
     * only supported by moderators.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @return <p>
     *         The membership type of a user, <code>DEFAULT</code> or
     *         <code>HIDDEN</code>. Default members are always returned as part
     *         of <code>ListChannelMemberships</code>. Hidden members are only
     *         returned if the type filter in
     *         <code>ListChannelMemberships</code> equals <code>HIDDEN</code>.
     *         Otherwise hidden members are not returned. This is only supported
     *         by moderators.
     *         </p>
     * @see ChannelMembershipType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or
     * <code>HIDDEN</code>. Default members are always returned as part of
     * <code>ListChannelMemberships</code>. Hidden members are only returned if
     * the type filter in <code>ListChannelMemberships</code> equals
     * <code>HIDDEN</code>. Otherwise hidden members are not returned. This is
     * only supported by moderators.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership type of a user, <code>DEFAULT</code> or
     *            <code>HIDDEN</code>. Default members are always returned as
     *            part of <code>ListChannelMemberships</code>. Hidden members
     *            are only returned if the type filter in
     *            <code>ListChannelMemberships</code> equals <code>HIDDEN</code>
     *            . Otherwise hidden members are not returned. This is only
     *            supported by moderators.
     *            </p>
     * @see ChannelMembershipType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or
     * <code>HIDDEN</code>. Default members are always returned as part of
     * <code>ListChannelMemberships</code>. Hidden members are only returned if
     * the type filter in <code>ListChannelMemberships</code> equals
     * <code>HIDDEN</code>. Otherwise hidden members are not returned. This is
     * only supported by moderators.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership type of a user, <code>DEFAULT</code> or
     *            <code>HIDDEN</code>. Default members are always returned as
     *            part of <code>ListChannelMemberships</code>. Hidden members
     *            are only returned if the type filter in
     *            <code>ListChannelMemberships</code> equals <code>HIDDEN</code>
     *            . Otherwise hidden members are not returned. This is only
     *            supported by moderators.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMembershipType
     */
    public CreateChannelMembershipRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or
     * <code>HIDDEN</code>. Default members are always returned as part of
     * <code>ListChannelMemberships</code>. Hidden members are only returned if
     * the type filter in <code>ListChannelMemberships</code> equals
     * <code>HIDDEN</code>. Otherwise hidden members are not returned. This is
     * only supported by moderators.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership type of a user, <code>DEFAULT</code> or
     *            <code>HIDDEN</code>. Default members are always returned as
     *            part of <code>ListChannelMemberships</code>. Hidden members
     *            are only returned if the type filter in
     *            <code>ListChannelMemberships</code> equals <code>HIDDEN</code>
     *            . Otherwise hidden members are not returned. This is only
     *            supported by moderators.
     *            </p>
     * @see ChannelMembershipType
     */
    public void setType(ChannelMembershipType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or
     * <code>HIDDEN</code>. Default members are always returned as part of
     * <code>ListChannelMemberships</code>. Hidden members are only returned if
     * the type filter in <code>ListChannelMemberships</code> equals
     * <code>HIDDEN</code>. Otherwise hidden members are not returned. This is
     * only supported by moderators.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership type of a user, <code>DEFAULT</code> or
     *            <code>HIDDEN</code>. Default members are always returned as
     *            part of <code>ListChannelMemberships</code>. Hidden members
     *            are only returned if the type filter in
     *            <code>ListChannelMemberships</code> equals <code>HIDDEN</code>
     *            . Otherwise hidden members are not returned. This is only
     *            supported by moderators.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMembershipType
     */
    public CreateChannelMembershipRequest withType(ChannelMembershipType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The <code>AppInstanceUserArn</code> of the user that makes the
     *         API call.
     *         </p>
     */
    public String getChimeBearer() {
        return chimeBearer;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param chimeBearer <p>
     *            The <code>AppInstanceUserArn</code> of the user that makes the
     *            API call.
     *            </p>
     */
    public void setChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param chimeBearer <p>
     *            The <code>AppInstanceUserArn</code> of the user that makes the
     *            API call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelMembershipRequest withChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
        return this;
    }

    /**
     * <p>
     * The ID of the SubChannel in the request.
     * </p>
     * <note>
     * <p>
     * Only required when creating membership in a SubChannel for a moderator in
     * an elastic channel.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The ID of the SubChannel in the request.
     *         </p>
     *         <note>
     *         <p>
     *         Only required when creating membership in a SubChannel for a
     *         moderator in an elastic channel.
     *         </p>
     *         </note>
     */
    public String getSubChannelId() {
        return subChannelId;
    }

    /**
     * <p>
     * The ID of the SubChannel in the request.
     * </p>
     * <note>
     * <p>
     * Only required when creating membership in a SubChannel for a moderator in
     * an elastic channel.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param subChannelId <p>
     *            The ID of the SubChannel in the request.
     *            </p>
     *            <note>
     *            <p>
     *            Only required when creating membership in a SubChannel for a
     *            moderator in an elastic channel.
     *            </p>
     *            </note>
     */
    public void setSubChannelId(String subChannelId) {
        this.subChannelId = subChannelId;
    }

    /**
     * <p>
     * The ID of the SubChannel in the request.
     * </p>
     * <note>
     * <p>
     * Only required when creating membership in a SubChannel for a moderator in
     * an elastic channel.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param subChannelId <p>
     *            The ID of the SubChannel in the request.
     *            </p>
     *            <note>
     *            <p>
     *            Only required when creating membership in a SubChannel for a
     *            moderator in an elastic channel.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelMembershipRequest withSubChannelId(String subChannelId) {
        this.subChannelId = subChannelId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getChannelArn() != null)
            sb.append("ChannelArn: " + getChannelArn() + ",");
        if (getMemberArn() != null)
            sb.append("MemberArn: " + getMemberArn() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getChimeBearer() != null)
            sb.append("ChimeBearer: " + getChimeBearer() + ",");
        if (getSubChannelId() != null)
            sb.append("SubChannelId: " + getSubChannelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getMemberArn() == null) ? 0 : getMemberArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getChimeBearer() == null) ? 0 : getChimeBearer().hashCode());
        hashCode = prime * hashCode
                + ((getSubChannelId() == null) ? 0 : getSubChannelId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateChannelMembershipRequest == false)
            return false;
        CreateChannelMembershipRequest other = (CreateChannelMembershipRequest) obj;

        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null
                && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getMemberArn() == null ^ this.getMemberArn() == null)
            return false;
        if (other.getMemberArn() != null
                && other.getMemberArn().equals(this.getMemberArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getChimeBearer() == null ^ this.getChimeBearer() == null)
            return false;
        if (other.getChimeBearer() != null
                && other.getChimeBearer().equals(this.getChimeBearer()) == false)
            return false;
        if (other.getSubChannelId() == null ^ this.getSubChannelId() == null)
            return false;
        if (other.getSubChannelId() != null
                && other.getSubChannelId().equals(this.getSubChannelId()) == false)
            return false;
        return true;
    }
}
