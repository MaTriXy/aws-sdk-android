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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

/**
 * <p>
 * The S3 location where your subtitle files are located. Note that your
 * subtitle files are placed in the same location as your transcription output.
 * Refer to <code>TranscriptFileUri</code> to download your files.
 * </p>
 */
public class SubtitlesOutput implements Serializable {
    /**
     * <p>
     * The format of your subtitle files. If your request specified both
     * <code>srt</code> and <code>vtt</code> formats, both formats are shown.
     * </p>
     */
    private java.util.List<String> formats;

    /**
     * <p>
     * Contains the output location for your subtitle file. This location must
     * be an S3 bucket.
     * </p>
     */
    private java.util.List<String> subtitleFileUris;

    /**
     * <p>
     * Shows the output start index value for your subtitle files. If you did
     * not specify a value in your request, the default value of <code>0</code>
     * is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     */
    private Integer outputStartIndex;

    /**
     * <p>
     * The format of your subtitle files. If your request specified both
     * <code>srt</code> and <code>vtt</code> formats, both formats are shown.
     * </p>
     *
     * @return <p>
     *         The format of your subtitle files. If your request specified both
     *         <code>srt</code> and <code>vtt</code> formats, both formats are
     *         shown.
     *         </p>
     */
    public java.util.List<String> getFormats() {
        return formats;
    }

    /**
     * <p>
     * The format of your subtitle files. If your request specified both
     * <code>srt</code> and <code>vtt</code> formats, both formats are shown.
     * </p>
     *
     * @param formats <p>
     *            The format of your subtitle files. If your request specified
     *            both <code>srt</code> and <code>vtt</code> formats, both
     *            formats are shown.
     *            </p>
     */
    public void setFormats(java.util.Collection<String> formats) {
        if (formats == null) {
            this.formats = null;
            return;
        }

        this.formats = new java.util.ArrayList<String>(formats);
    }

    /**
     * <p>
     * The format of your subtitle files. If your request specified both
     * <code>srt</code> and <code>vtt</code> formats, both formats are shown.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param formats <p>
     *            The format of your subtitle files. If your request specified
     *            both <code>srt</code> and <code>vtt</code> formats, both
     *            formats are shown.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubtitlesOutput withFormats(String... formats) {
        if (getFormats() == null) {
            this.formats = new java.util.ArrayList<String>(formats.length);
        }
        for (String value : formats) {
            this.formats.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The format of your subtitle files. If your request specified both
     * <code>srt</code> and <code>vtt</code> formats, both formats are shown.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param formats <p>
     *            The format of your subtitle files. If your request specified
     *            both <code>srt</code> and <code>vtt</code> formats, both
     *            formats are shown.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubtitlesOutput withFormats(java.util.Collection<String> formats) {
        setFormats(formats);
        return this;
    }

    /**
     * <p>
     * Contains the output location for your subtitle file. This location must
     * be an S3 bucket.
     * </p>
     *
     * @return <p>
     *         Contains the output location for your subtitle file. This
     *         location must be an S3 bucket.
     *         </p>
     */
    public java.util.List<String> getSubtitleFileUris() {
        return subtitleFileUris;
    }

    /**
     * <p>
     * Contains the output location for your subtitle file. This location must
     * be an S3 bucket.
     * </p>
     *
     * @param subtitleFileUris <p>
     *            Contains the output location for your subtitle file. This
     *            location must be an S3 bucket.
     *            </p>
     */
    public void setSubtitleFileUris(java.util.Collection<String> subtitleFileUris) {
        if (subtitleFileUris == null) {
            this.subtitleFileUris = null;
            return;
        }

        this.subtitleFileUris = new java.util.ArrayList<String>(subtitleFileUris);
    }

    /**
     * <p>
     * Contains the output location for your subtitle file. This location must
     * be an S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subtitleFileUris <p>
     *            Contains the output location for your subtitle file. This
     *            location must be an S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubtitlesOutput withSubtitleFileUris(String... subtitleFileUris) {
        if (getSubtitleFileUris() == null) {
            this.subtitleFileUris = new java.util.ArrayList<String>(subtitleFileUris.length);
        }
        for (String value : subtitleFileUris) {
            this.subtitleFileUris.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains the output location for your subtitle file. This location must
     * be an S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subtitleFileUris <p>
     *            Contains the output location for your subtitle file. This
     *            location must be an S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubtitlesOutput withSubtitleFileUris(java.util.Collection<String> subtitleFileUris) {
        setSubtitleFileUris(subtitleFileUris);
        return this;
    }

    /**
     * <p>
     * Shows the output start index value for your subtitle files. If you did
     * not specify a value in your request, the default value of <code>0</code>
     * is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @return <p>
     *         Shows the output start index value for your subtitle files. If
     *         you did not specify a value in your request, the default value of
     *         <code>0</code> is used.
     *         </p>
     */
    public Integer getOutputStartIndex() {
        return outputStartIndex;
    }

    /**
     * <p>
     * Shows the output start index value for your subtitle files. If you did
     * not specify a value in your request, the default value of <code>0</code>
     * is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param outputStartIndex <p>
     *            Shows the output start index value for your subtitle files. If
     *            you did not specify a value in your request, the default value
     *            of <code>0</code> is used.
     *            </p>
     */
    public void setOutputStartIndex(Integer outputStartIndex) {
        this.outputStartIndex = outputStartIndex;
    }

    /**
     * <p>
     * Shows the output start index value for your subtitle files. If you did
     * not specify a value in your request, the default value of <code>0</code>
     * is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param outputStartIndex <p>
     *            Shows the output start index value for your subtitle files. If
     *            you did not specify a value in your request, the default value
     *            of <code>0</code> is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubtitlesOutput withOutputStartIndex(Integer outputStartIndex) {
        this.outputStartIndex = outputStartIndex;
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
        if (getFormats() != null)
            sb.append("Formats: " + getFormats() + ",");
        if (getSubtitleFileUris() != null)
            sb.append("SubtitleFileUris: " + getSubtitleFileUris() + ",");
        if (getOutputStartIndex() != null)
            sb.append("OutputStartIndex: " + getOutputStartIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormats() == null) ? 0 : getFormats().hashCode());
        hashCode = prime * hashCode
                + ((getSubtitleFileUris() == null) ? 0 : getSubtitleFileUris().hashCode());
        hashCode = prime * hashCode
                + ((getOutputStartIndex() == null) ? 0 : getOutputStartIndex().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubtitlesOutput == false)
            return false;
        SubtitlesOutput other = (SubtitlesOutput) obj;

        if (other.getFormats() == null ^ this.getFormats() == null)
            return false;
        if (other.getFormats() != null && other.getFormats().equals(this.getFormats()) == false)
            return false;
        if (other.getSubtitleFileUris() == null ^ this.getSubtitleFileUris() == null)
            return false;
        if (other.getSubtitleFileUris() != null
                && other.getSubtitleFileUris().equals(this.getSubtitleFileUris()) == false)
            return false;
        if (other.getOutputStartIndex() == null ^ this.getOutputStartIndex() == null)
            return false;
        if (other.getOutputStartIndex() != null
                && other.getOutputStartIndex().equals(this.getOutputStartIndex()) == false)
            return false;
        return true;
    }
}
