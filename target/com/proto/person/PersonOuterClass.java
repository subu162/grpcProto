// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/greet/person.proto

package com.proto.person;

public final class PersonOuterClass {
  private PersonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!src/main/proto/greet/person.proto\022\005gre" +
      "et\"(\n\006Person\022\014\n\004name\030\001 \001(\t\022\020\n\010sir_name\030\002" +
      " \001(\tB\024\n\020com.proto.personP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_greet_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greet_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_Person_descriptor,
        new java.lang.String[] { "Name", "SirName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
