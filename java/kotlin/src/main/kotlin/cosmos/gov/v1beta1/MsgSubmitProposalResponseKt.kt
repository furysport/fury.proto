//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1beta1/tx.proto

package cosmos.gov.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun msgSubmitProposalResponse(block: cosmos.gov.v1beta1.MsgSubmitProposalResponseKt.Dsl.() -> Unit): cosmos.gov.v1beta1.Tx.MsgSubmitProposalResponse =
  cosmos.gov.v1beta1.MsgSubmitProposalResponseKt.Dsl._create(cosmos.gov.v1beta1.Tx.MsgSubmitProposalResponse.newBuilder()).apply { block() }._build()
object MsgSubmitProposalResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.gov.v1beta1.Tx.MsgSubmitProposalResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1beta1.Tx.MsgSubmitProposalResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1beta1.Tx.MsgSubmitProposalResponse = _builder.build()

    /**
     * <code>uint64 proposal_id = 1 [(.gogoproto.jsontag) = "proposal_id", (.gogoproto.moretags) = "yaml:&#92;"proposal_id&#92;""];</code>
     */
    var proposalId: kotlin.Long
      @JvmName("getProposalId")
      get() = _builder.getProposalId()
      @JvmName("setProposalId")
      set(value) {
        _builder.setProposalId(value)
      }
    /**
     * <code>uint64 proposal_id = 1 [(.gogoproto.jsontag) = "proposal_id", (.gogoproto.moretags) = "yaml:&#92;"proposal_id&#92;""];</code>
     */
    fun clearProposalId() {
      _builder.clearProposalId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.gov.v1beta1.Tx.MsgSubmitProposalResponse.copy(block: cosmos.gov.v1beta1.MsgSubmitProposalResponseKt.Dsl.() -> Unit): cosmos.gov.v1beta1.Tx.MsgSubmitProposalResponse =
  cosmos.gov.v1beta1.MsgSubmitProposalResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
