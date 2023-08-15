// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShowTemplateReminderNotify.proto

package emu.grasscutter.net.proto;

public final class ShowTemplateReminderNotifyOuterClass {
  private ShowTemplateReminderNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ShowTemplateReminderNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ShowTemplateReminderNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 template_reminder_id = 5;</code>
     * @return The templateReminderId.
     */
    int getTemplateReminderId();

    /**
     * <code>bool EGFLCDAEPJA = 2;</code>
     * @return The eGFLCDAEPJA.
     */
    boolean getEGFLCDAEPJA();

    /**
     * <code>bool FKICHIHKNGC = 6;</code>
     * @return The fKICHIHKNGC.
     */
    boolean getFKICHIHKNGC();

    /**
     * <code>repeated uint32 param_uid_list = 15;</code>
     * @return A list containing the paramUidList.
     */
    java.util.List<java.lang.Integer> getParamUidListList();
    /**
     * <code>repeated uint32 param_uid_list = 15;</code>
     * @return The count of paramUidList.
     */
    int getParamUidListCount();
    /**
     * <code>repeated uint32 param_uid_list = 15;</code>
     * @param index The index of the element to return.
     * @return The paramUidList at the given index.
     */
    int getParamUidList(int index);

    /**
     * <code>repeated int32 param_list = 3;</code>
     * @return A list containing the paramList.
     */
    java.util.List<java.lang.Integer> getParamListList();
    /**
     * <code>repeated int32 param_list = 3;</code>
     * @return The count of paramList.
     */
    int getParamListCount();
    /**
     * <code>repeated int32 param_list = 3;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    int getParamList(int index);
  }
  /**
   * <pre>
   * CmdId: 24864
   * Obf: OFDMEDPBBHI
   * </pre>
   *
   * Protobuf type {@code ShowTemplateReminderNotify}
   */
  public static final class ShowTemplateReminderNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ShowTemplateReminderNotify)
      ShowTemplateReminderNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ShowTemplateReminderNotify.newBuilder() to construct.
    private ShowTemplateReminderNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ShowTemplateReminderNotify() {
      paramUidList_ = emptyIntList();
      paramList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ShowTemplateReminderNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ShowTemplateReminderNotify(
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
            case 16: {

              eGFLCDAEPJA_ = input.readBool();
              break;
            }
            case 24: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                paramList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              paramList_.addInt(input.readInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                paramList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                paramList_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 40: {

              templateReminderId_ = input.readUInt32();
              break;
            }
            case 48: {

              fKICHIHKNGC_ = input.readBool();
              break;
            }
            case 120: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                paramUidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              paramUidList_.addInt(input.readUInt32());
              break;
            }
            case 122: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                paramUidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                paramUidList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          paramList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          paramUidList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.internal_static_ShowTemplateReminderNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.internal_static_ShowTemplateReminderNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify.class, emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify.Builder.class);
    }

    public static final int TEMPLATE_REMINDER_ID_FIELD_NUMBER = 5;
    private int templateReminderId_;
    /**
     * <code>uint32 template_reminder_id = 5;</code>
     * @return The templateReminderId.
     */
    @java.lang.Override
    public int getTemplateReminderId() {
      return templateReminderId_;
    }

    public static final int EGFLCDAEPJA_FIELD_NUMBER = 2;
    private boolean eGFLCDAEPJA_;
    /**
     * <code>bool EGFLCDAEPJA = 2;</code>
     * @return The eGFLCDAEPJA.
     */
    @java.lang.Override
    public boolean getEGFLCDAEPJA() {
      return eGFLCDAEPJA_;
    }

    public static final int FKICHIHKNGC_FIELD_NUMBER = 6;
    private boolean fKICHIHKNGC_;
    /**
     * <code>bool FKICHIHKNGC = 6;</code>
     * @return The fKICHIHKNGC.
     */
    @java.lang.Override
    public boolean getFKICHIHKNGC() {
      return fKICHIHKNGC_;
    }

    public static final int PARAM_UID_LIST_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList paramUidList_;
    /**
     * <code>repeated uint32 param_uid_list = 15;</code>
     * @return A list containing the paramUidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getParamUidListList() {
      return paramUidList_;
    }
    /**
     * <code>repeated uint32 param_uid_list = 15;</code>
     * @return The count of paramUidList.
     */
    public int getParamUidListCount() {
      return paramUidList_.size();
    }
    /**
     * <code>repeated uint32 param_uid_list = 15;</code>
     * @param index The index of the element to return.
     * @return The paramUidList at the given index.
     */
    public int getParamUidList(int index) {
      return paramUidList_.getInt(index);
    }
    private int paramUidListMemoizedSerializedSize = -1;

    public static final int PARAM_LIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList paramList_;
    /**
     * <code>repeated int32 param_list = 3;</code>
     * @return A list containing the paramList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getParamListList() {
      return paramList_;
    }
    /**
     * <code>repeated int32 param_list = 3;</code>
     * @return The count of paramList.
     */
    public int getParamListCount() {
      return paramList_.size();
    }
    /**
     * <code>repeated int32 param_list = 3;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    public int getParamList(int index) {
      return paramList_.getInt(index);
    }
    private int paramListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (eGFLCDAEPJA_ != false) {
        output.writeBool(2, eGFLCDAEPJA_);
      }
      if (getParamListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(paramListMemoizedSerializedSize);
      }
      for (int i = 0; i < paramList_.size(); i++) {
        output.writeInt32NoTag(paramList_.getInt(i));
      }
      if (templateReminderId_ != 0) {
        output.writeUInt32(5, templateReminderId_);
      }
      if (fKICHIHKNGC_ != false) {
        output.writeBool(6, fKICHIHKNGC_);
      }
      if (getParamUidListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(paramUidListMemoizedSerializedSize);
      }
      for (int i = 0; i < paramUidList_.size(); i++) {
        output.writeUInt32NoTag(paramUidList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (eGFLCDAEPJA_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, eGFLCDAEPJA_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < paramList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(paramList_.getInt(i));
        }
        size += dataSize;
        if (!getParamListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        paramListMemoizedSerializedSize = dataSize;
      }
      if (templateReminderId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, templateReminderId_);
      }
      if (fKICHIHKNGC_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, fKICHIHKNGC_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < paramUidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(paramUidList_.getInt(i));
        }
        size += dataSize;
        if (!getParamUidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        paramUidListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify other = (emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify) obj;

      if (getTemplateReminderId()
          != other.getTemplateReminderId()) return false;
      if (getEGFLCDAEPJA()
          != other.getEGFLCDAEPJA()) return false;
      if (getFKICHIHKNGC()
          != other.getFKICHIHKNGC()) return false;
      if (!getParamUidListList()
          .equals(other.getParamUidListList())) return false;
      if (!getParamListList()
          .equals(other.getParamListList())) return false;
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
      hash = (37 * hash) + TEMPLATE_REMINDER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTemplateReminderId();
      hash = (37 * hash) + EGFLCDAEPJA_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getEGFLCDAEPJA());
      hash = (37 * hash) + FKICHIHKNGC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getFKICHIHKNGC());
      if (getParamUidListCount() > 0) {
        hash = (37 * hash) + PARAM_UID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getParamUidListList().hashCode();
      }
      if (getParamListCount() > 0) {
        hash = (37 * hash) + PARAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getParamListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify prototype) {
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
     * CmdId: 24864
     * Obf: OFDMEDPBBHI
     * </pre>
     *
     * Protobuf type {@code ShowTemplateReminderNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ShowTemplateReminderNotify)
        emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.internal_static_ShowTemplateReminderNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.internal_static_ShowTemplateReminderNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify.class, emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        templateReminderId_ = 0;

        eGFLCDAEPJA_ = false;

        fKICHIHKNGC_ = false;

        paramUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        paramList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.internal_static_ShowTemplateReminderNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify build() {
        emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify buildPartial() {
        emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify result = new emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify(this);
        int from_bitField0_ = bitField0_;
        result.templateReminderId_ = templateReminderId_;
        result.eGFLCDAEPJA_ = eGFLCDAEPJA_;
        result.fKICHIHKNGC_ = fKICHIHKNGC_;
        if (((bitField0_ & 0x00000001) != 0)) {
          paramUidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.paramUidList_ = paramUidList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          paramList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.paramList_ = paramList_;
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
        if (other instanceof emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify other) {
        if (other == emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify.getDefaultInstance()) return this;
        if (other.getTemplateReminderId() != 0) {
          setTemplateReminderId(other.getTemplateReminderId());
        }
        if (other.getEGFLCDAEPJA() != false) {
          setEGFLCDAEPJA(other.getEGFLCDAEPJA());
        }
        if (other.getFKICHIHKNGC() != false) {
          setFKICHIHKNGC(other.getFKICHIHKNGC());
        }
        if (!other.paramUidList_.isEmpty()) {
          if (paramUidList_.isEmpty()) {
            paramUidList_ = other.paramUidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureParamUidListIsMutable();
            paramUidList_.addAll(other.paramUidList_);
          }
          onChanged();
        }
        if (!other.paramList_.isEmpty()) {
          if (paramList_.isEmpty()) {
            paramList_ = other.paramList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureParamListIsMutable();
            paramList_.addAll(other.paramList_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int templateReminderId_ ;
      /**
       * <code>uint32 template_reminder_id = 5;</code>
       * @return The templateReminderId.
       */
      @java.lang.Override
      public int getTemplateReminderId() {
        return templateReminderId_;
      }
      /**
       * <code>uint32 template_reminder_id = 5;</code>
       * @param value The templateReminderId to set.
       * @return This builder for chaining.
       */
      public Builder setTemplateReminderId(int value) {
        
        templateReminderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 template_reminder_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTemplateReminderId() {
        
        templateReminderId_ = 0;
        onChanged();
        return this;
      }

      private boolean eGFLCDAEPJA_ ;
      /**
       * <code>bool EGFLCDAEPJA = 2;</code>
       * @return The eGFLCDAEPJA.
       */
      @java.lang.Override
      public boolean getEGFLCDAEPJA() {
        return eGFLCDAEPJA_;
      }
      /**
       * <code>bool EGFLCDAEPJA = 2;</code>
       * @param value The eGFLCDAEPJA to set.
       * @return This builder for chaining.
       */
      public Builder setEGFLCDAEPJA(boolean value) {
        
        eGFLCDAEPJA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool EGFLCDAEPJA = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEGFLCDAEPJA() {
        
        eGFLCDAEPJA_ = false;
        onChanged();
        return this;
      }

      private boolean fKICHIHKNGC_ ;
      /**
       * <code>bool FKICHIHKNGC = 6;</code>
       * @return The fKICHIHKNGC.
       */
      @java.lang.Override
      public boolean getFKICHIHKNGC() {
        return fKICHIHKNGC_;
      }
      /**
       * <code>bool FKICHIHKNGC = 6;</code>
       * @param value The fKICHIHKNGC to set.
       * @return This builder for chaining.
       */
      public Builder setFKICHIHKNGC(boolean value) {
        
        fKICHIHKNGC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool FKICHIHKNGC = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearFKICHIHKNGC() {
        
        fKICHIHKNGC_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList paramUidList_ = emptyIntList();
      private void ensureParamUidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          paramUidList_ = mutableCopy(paramUidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 param_uid_list = 15;</code>
       * @return A list containing the paramUidList.
       */
      public java.util.List<java.lang.Integer>
          getParamUidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(paramUidList_) : paramUidList_;
      }
      /**
       * <code>repeated uint32 param_uid_list = 15;</code>
       * @return The count of paramUidList.
       */
      public int getParamUidListCount() {
        return paramUidList_.size();
      }
      /**
       * <code>repeated uint32 param_uid_list = 15;</code>
       * @param index The index of the element to return.
       * @return The paramUidList at the given index.
       */
      public int getParamUidList(int index) {
        return paramUidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 param_uid_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The paramUidList to set.
       * @return This builder for chaining.
       */
      public Builder setParamUidList(
          int index, int value) {
        ensureParamUidListIsMutable();
        paramUidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param_uid_list = 15;</code>
       * @param value The paramUidList to add.
       * @return This builder for chaining.
       */
      public Builder addParamUidList(int value) {
        ensureParamUidListIsMutable();
        paramUidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param_uid_list = 15;</code>
       * @param values The paramUidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllParamUidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureParamUidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, paramUidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param_uid_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearParamUidList() {
        paramUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList paramList_ = emptyIntList();
      private void ensureParamListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          paramList_ = mutableCopy(paramList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated int32 param_list = 3;</code>
       * @return A list containing the paramList.
       */
      public java.util.List<java.lang.Integer>
          getParamListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(paramList_) : paramList_;
      }
      /**
       * <code>repeated int32 param_list = 3;</code>
       * @return The count of paramList.
       */
      public int getParamListCount() {
        return paramList_.size();
      }
      /**
       * <code>repeated int32 param_list = 3;</code>
       * @param index The index of the element to return.
       * @return The paramList at the given index.
       */
      public int getParamList(int index) {
        return paramList_.getInt(index);
      }
      /**
       * <code>repeated int32 param_list = 3;</code>
       * @param index The index to set the value at.
       * @param value The paramList to set.
       * @return This builder for chaining.
       */
      public Builder setParamList(
          int index, int value) {
        ensureParamListIsMutable();
        paramList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 param_list = 3;</code>
       * @param value The paramList to add.
       * @return This builder for chaining.
       */
      public Builder addParamList(int value) {
        ensureParamListIsMutable();
        paramList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 param_list = 3;</code>
       * @param values The paramList to add.
       * @return This builder for chaining.
       */
      public Builder addAllParamList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureParamListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, paramList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 param_list = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearParamList() {
        paramList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:ShowTemplateReminderNotify)
    }

    // @@protoc_insertion_point(class_scope:ShowTemplateReminderNotify)
    private static final emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify();
    }

    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ShowTemplateReminderNotify>
        PARSER = new com.google.protobuf.AbstractParser<ShowTemplateReminderNotify>() {
      @java.lang.Override
      public ShowTemplateReminderNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ShowTemplateReminderNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ShowTemplateReminderNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ShowTemplateReminderNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ShowTemplateReminderNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ShowTemplateReminderNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ShowTemplateReminderNotify.proto\"\220\001\n\032S" +
      "howTemplateReminderNotify\022\034\n\024template_re" +
      "minder_id\030\005 \001(\r\022\023\n\013EGFLCDAEPJA\030\002 \001(\010\022\023\n\013" +
      "FKICHIHKNGC\030\006 \001(\010\022\026\n\016param_uid_list\030\017 \003(" +
      "\r\022\022\n\nparam_list\030\003 \003(\005B\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ShowTemplateReminderNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ShowTemplateReminderNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ShowTemplateReminderNotify_descriptor,
        new java.lang.String[] { "TemplateReminderId", "EGFLCDAEPJA", "FKICHIHKNGC", "ParamUidList", "ParamList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
