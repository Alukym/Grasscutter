// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JEIJNAMBMJD.proto

package emu.grasscutter.net.proto;

public final class JEIJNAMBMJDOuterClass {
  private JEIJNAMBMJDOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JEIJNAMBMJDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JEIJNAMBMJD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
     */
    java.util.List<emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH> 
        getJGIIFBFPKKPList();
    /**
     * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
     */
    emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH getJGIIFBFPKKP(int index);
    /**
     * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
     */
    int getJGIIFBFPKKPCount();
    /**
     * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAHOrBuilder> 
        getJGIIFBFPKKPOrBuilderList();
    /**
     * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
     */
    emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAHOrBuilder getJGIIFBFPKKPOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 26847
   * </pre>
   *
   * Protobuf type {@code JEIJNAMBMJD}
   */
  public static final class JEIJNAMBMJD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JEIJNAMBMJD)
      JEIJNAMBMJDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JEIJNAMBMJD.newBuilder() to construct.
    private JEIJNAMBMJD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JEIJNAMBMJD() {
      jGIIFBFPKKP_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JEIJNAMBMJD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private JEIJNAMBMJD(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                jGIIFBFPKKP_ = new java.util.ArrayList<emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH>();
                mutable_bitField0_ |= 0x00000001;
              }
              jGIIFBFPKKP_.add(
                  input.readMessage(emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          jGIIFBFPKKP_ = java.util.Collections.unmodifiableList(jGIIFBFPKKP_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.internal_static_JEIJNAMBMJD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.internal_static_JEIJNAMBMJD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD.class, emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD.Builder.class);
    }

    public static final int JGIIFBFPKKP_FIELD_NUMBER = 4;
    private java.util.List<emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH> jGIIFBFPKKP_;
    /**
     * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH> getJGIIFBFPKKPList() {
      return jGIIFBFPKKP_;
    }
    /**
     * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAHOrBuilder> 
        getJGIIFBFPKKPOrBuilderList() {
      return jGIIFBFPKKP_;
    }
    /**
     * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
     */
    @java.lang.Override
    public int getJGIIFBFPKKPCount() {
      return jGIIFBFPKKP_.size();
    }
    /**
     * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH getJGIIFBFPKKP(int index) {
      return jGIIFBFPKKP_.get(index);
    }
    /**
     * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAHOrBuilder getJGIIFBFPKKPOrBuilder(
        int index) {
      return jGIIFBFPKKP_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < jGIIFBFPKKP_.size(); i++) {
        output.writeMessage(4, jGIIFBFPKKP_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < jGIIFBFPKKP_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, jGIIFBFPKKP_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD other = (emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD) obj;

      if (!getJGIIFBFPKKPList()
          .equals(other.getJGIIFBFPKKPList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getJGIIFBFPKKPCount() > 0) {
        hash = (37 * hash) + JGIIFBFPKKP_FIELD_NUMBER;
        hash = (53 * hash) + getJGIIFBFPKKPList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 26847
     * </pre>
     *
     * Protobuf type {@code JEIJNAMBMJD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JEIJNAMBMJD)
        emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.internal_static_JEIJNAMBMJD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.internal_static_JEIJNAMBMJD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD.class, emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getJGIIFBFPKKPFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (jGIIFBFPKKPBuilder_ == null) {
          jGIIFBFPKKP_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          jGIIFBFPKKPBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.internal_static_JEIJNAMBMJD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD build() {
        emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD buildPartial() {
        emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD result = new emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD(this);
        int from_bitField0_ = bitField0_;
        if (jGIIFBFPKKPBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            jGIIFBFPKKP_ = java.util.Collections.unmodifiableList(jGIIFBFPKKP_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.jGIIFBFPKKP_ = jGIIFBFPKKP_;
        } else {
          result.jGIIFBFPKKP_ = jGIIFBFPKKPBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD) {
          return mergeFrom((emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD other) {
        if (other == emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD.getDefaultInstance()) return this;
        if (jGIIFBFPKKPBuilder_ == null) {
          if (!other.jGIIFBFPKKP_.isEmpty()) {
            if (jGIIFBFPKKP_.isEmpty()) {
              jGIIFBFPKKP_ = other.jGIIFBFPKKP_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureJGIIFBFPKKPIsMutable();
              jGIIFBFPKKP_.addAll(other.jGIIFBFPKKP_);
            }
            onChanged();
          }
        } else {
          if (!other.jGIIFBFPKKP_.isEmpty()) {
            if (jGIIFBFPKKPBuilder_.isEmpty()) {
              jGIIFBFPKKPBuilder_.dispose();
              jGIIFBFPKKPBuilder_ = null;
              jGIIFBFPKKP_ = other.jGIIFBFPKKP_;
              bitField0_ = (bitField0_ & ~0x00000001);
              jGIIFBFPKKPBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getJGIIFBFPKKPFieldBuilder() : null;
            } else {
              jGIIFBFPKKPBuilder_.addAllMessages(other.jGIIFBFPKKP_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH> jGIIFBFPKKP_ =
        java.util.Collections.emptyList();
      private void ensureJGIIFBFPKKPIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          jGIIFBFPKKP_ = new java.util.ArrayList<emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH>(jGIIFBFPKKP_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH, emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH.Builder, emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAHOrBuilder> jGIIFBFPKKPBuilder_;

      /**
       * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH> getJGIIFBFPKKPList() {
        if (jGIIFBFPKKPBuilder_ == null) {
          return java.util.Collections.unmodifiableList(jGIIFBFPKKP_);
        } else {
          return jGIIFBFPKKPBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
       */
      public int getJGIIFBFPKKPCount() {
        if (jGIIFBFPKKPBuilder_ == null) {
          return jGIIFBFPKKP_.size();
        } else {
          return jGIIFBFPKKPBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
       */
      public emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH getJGIIFBFPKKP(int index) {
        if (jGIIFBFPKKPBuilder_ == null) {
          return jGIIFBFPKKP_.get(index);
        } else {
          return jGIIFBFPKKPBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
       */
      public Builder setJGIIFBFPKKP(
          int index, emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH value) {
        if (jGIIFBFPKKPBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureJGIIFBFPKKPIsMutable();
          jGIIFBFPKKP_.set(index, value);
          onChanged();
        } else {
          jGIIFBFPKKPBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
       */
      public Builder setJGIIFBFPKKP(
          int index, emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH.Builder builderForValue) {
        if (jGIIFBFPKKPBuilder_ == null) {
          ensureJGIIFBFPKKPIsMutable();
          jGIIFBFPKKP_.set(index, builderForValue.build());
          onChanged();
        } else {
          jGIIFBFPKKPBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
       */
      public Builder addJGIIFBFPKKP(emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH value) {
        if (jGIIFBFPKKPBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureJGIIFBFPKKPIsMutable();
          jGIIFBFPKKP_.add(value);
          onChanged();
        } else {
          jGIIFBFPKKPBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
       */
      public Builder addJGIIFBFPKKP(
          int index, emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH value) {
        if (jGIIFBFPKKPBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureJGIIFBFPKKPIsMutable();
          jGIIFBFPKKP_.add(index, value);
          onChanged();
        } else {
          jGIIFBFPKKPBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
       */
      public Builder addJGIIFBFPKKP(
          emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH.Builder builderForValue) {
        if (jGIIFBFPKKPBuilder_ == null) {
          ensureJGIIFBFPKKPIsMutable();
          jGIIFBFPKKP_.add(builderForValue.build());
          onChanged();
        } else {
          jGIIFBFPKKPBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
       */
      public Builder addJGIIFBFPKKP(
          int index, emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH.Builder builderForValue) {
        if (jGIIFBFPKKPBuilder_ == null) {
          ensureJGIIFBFPKKPIsMutable();
          jGIIFBFPKKP_.add(index, builderForValue.build());
          onChanged();
        } else {
          jGIIFBFPKKPBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
       */
      public Builder addAllJGIIFBFPKKP(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH> values) {
        if (jGIIFBFPKKPBuilder_ == null) {
          ensureJGIIFBFPKKPIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, jGIIFBFPKKP_);
          onChanged();
        } else {
          jGIIFBFPKKPBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
       */
      public Builder clearJGIIFBFPKKP() {
        if (jGIIFBFPKKPBuilder_ == null) {
          jGIIFBFPKKP_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          jGIIFBFPKKPBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
       */
      public Builder removeJGIIFBFPKKP(int index) {
        if (jGIIFBFPKKPBuilder_ == null) {
          ensureJGIIFBFPKKPIsMutable();
          jGIIFBFPKKP_.remove(index);
          onChanged();
        } else {
          jGIIFBFPKKPBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
       */
      public emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH.Builder getJGIIFBFPKKPBuilder(
          int index) {
        return getJGIIFBFPKKPFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
       */
      public emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAHOrBuilder getJGIIFBFPKKPOrBuilder(
          int index) {
        if (jGIIFBFPKKPBuilder_ == null) {
          return jGIIFBFPKKP_.get(index);  } else {
          return jGIIFBFPKKPBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAHOrBuilder> 
           getJGIIFBFPKKPOrBuilderList() {
        if (jGIIFBFPKKPBuilder_ != null) {
          return jGIIFBFPKKPBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(jGIIFBFPKKP_);
        }
      }
      /**
       * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
       */
      public emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH.Builder addJGIIFBFPKKPBuilder() {
        return getJGIIFBFPKKPFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH.getDefaultInstance());
      }
      /**
       * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
       */
      public emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH.Builder addJGIIFBFPKKPBuilder(
          int index) {
        return getJGIIFBFPKKPFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH.getDefaultInstance());
      }
      /**
       * <code>repeated .DACHAFPOGAH JGIIFBFPKKP = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH.Builder> 
           getJGIIFBFPKKPBuilderList() {
        return getJGIIFBFPKKPFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH, emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH.Builder, emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAHOrBuilder> 
          getJGIIFBFPKKPFieldBuilder() {
        if (jGIIFBFPKKPBuilder_ == null) {
          jGIIFBFPKKPBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH, emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAH.Builder, emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.DACHAFPOGAHOrBuilder>(
                  jGIIFBFPKKP_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          jGIIFBFPKKP_ = null;
        }
        return jGIIFBFPKKPBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:JEIJNAMBMJD)
    }

    // @@protoc_insertion_point(class_scope:JEIJNAMBMJD)
    private static final emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD();
    }

    public static emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JEIJNAMBMJD>
        PARSER = new com.google.protobuf.AbstractParser<JEIJNAMBMJD>() {
      @java.lang.Override
      public JEIJNAMBMJD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JEIJNAMBMJD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<JEIJNAMBMJD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JEIJNAMBMJD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.JEIJNAMBMJDOuterClass.JEIJNAMBMJD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JEIJNAMBMJD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JEIJNAMBMJD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021JEIJNAMBMJD.proto\032\021DACHAFPOGAH.proto\"0" +
      "\n\013JEIJNAMBMJD\022!\n\013JGIIFBFPKKP\030\004 \003(\0132\014.DAC" +
      "HAFPOGAHB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.getDescriptor(),
        });
    internal_static_JEIJNAMBMJD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JEIJNAMBMJD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JEIJNAMBMJD_descriptor,
        new java.lang.String[] { "JGIIFBFPKKP", });
    emu.grasscutter.net.proto.DACHAFPOGAHOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
