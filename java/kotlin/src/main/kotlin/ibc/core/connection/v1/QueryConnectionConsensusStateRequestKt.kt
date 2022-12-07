//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/connection/v1/query.proto

package ibc.core.connection.v1;

@kotlin.jvm.JvmSynthetic
inline fun queryConnectionConsensusStateRequest(block: ibc.core.connection.v1.QueryConnectionConsensusStateRequestKt.Dsl.() -> Unit): ibc.core.connection.v1.QueryOuterClass.QueryConnectionConsensusStateRequest =
  ibc.core.connection.v1.QueryConnectionConsensusStateRequestKt.Dsl._create(ibc.core.connection.v1.QueryOuterClass.QueryConnectionConsensusStateRequest.newBuilder()).apply { block() }._build()
object QueryConnectionConsensusStateRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: ibc.core.connection.v1.QueryOuterClass.QueryConnectionConsensusStateRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.connection.v1.QueryOuterClass.QueryConnectionConsensusStateRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.connection.v1.QueryOuterClass.QueryConnectionConsensusStateRequest = _builder.build()

    /**
     * <pre>
     * connection identifier
     * </pre>
     *
     * <code>string connection_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
     */
    var connectionId: kotlin.String
      @JvmName("getConnectionId")
      get() = _builder.getConnectionId()
      @JvmName("setConnectionId")
      set(value) {
        _builder.setConnectionId(value)
      }
    /**
     * <pre>
     * connection identifier
     * </pre>
     *
     * <code>string connection_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
     */
    fun clearConnectionId() {
      _builder.clearConnectionId()
    }

    /**
     * <code>uint64 revision_number = 2;</code>
     */
    var revisionNumber: kotlin.Long
      @JvmName("getRevisionNumber")
      get() = _builder.getRevisionNumber()
      @JvmName("setRevisionNumber")
      set(value) {
        _builder.setRevisionNumber(value)
      }
    /**
     * <code>uint64 revision_number = 2;</code>
     */
    fun clearRevisionNumber() {
      _builder.clearRevisionNumber()
    }

    /**
     * <code>uint64 revision_height = 3;</code>
     */
    var revisionHeight: kotlin.Long
      @JvmName("getRevisionHeight")
      get() = _builder.getRevisionHeight()
      @JvmName("setRevisionHeight")
      set(value) {
        _builder.setRevisionHeight(value)
      }
    /**
     * <code>uint64 revision_height = 3;</code>
     */
    fun clearRevisionHeight() {
      _builder.clearRevisionHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun ibc.core.connection.v1.QueryOuterClass.QueryConnectionConsensusStateRequest.copy(block: ibc.core.connection.v1.QueryConnectionConsensusStateRequestKt.Dsl.() -> Unit): ibc.core.connection.v1.QueryOuterClass.QueryConnectionConsensusStateRequest =
  ibc.core.connection.v1.QueryConnectionConsensusStateRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
