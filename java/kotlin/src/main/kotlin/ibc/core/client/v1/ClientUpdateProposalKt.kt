//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/client/v1/client.proto

package ibc.core.client.v1;

@kotlin.jvm.JvmSynthetic
inline fun clientUpdateProposal(block: ibc.core.client.v1.ClientUpdateProposalKt.Dsl.() -> Unit): ibc.core.client.v1.Client.ClientUpdateProposal =
  ibc.core.client.v1.ClientUpdateProposalKt.Dsl._create(ibc.core.client.v1.Client.ClientUpdateProposal.newBuilder()).apply { block() }._build()
object ClientUpdateProposalKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: ibc.core.client.v1.Client.ClientUpdateProposal.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.client.v1.Client.ClientUpdateProposal.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.client.v1.Client.ClientUpdateProposal = _builder.build()

    /**
     * <pre>
     * the title of the update proposal
     * </pre>
     *
     * <code>string title = 1;</code>
     */
    var title: kotlin.String
      @JvmName("getTitle")
      get() = _builder.getTitle()
      @JvmName("setTitle")
      set(value) {
        _builder.setTitle(value)
      }
    /**
     * <pre>
     * the title of the update proposal
     * </pre>
     *
     * <code>string title = 1;</code>
     */
    fun clearTitle() {
      _builder.clearTitle()
    }

    /**
     * <pre>
     * the description of the proposal
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    var description: kotlin.String
      @JvmName("getDescription")
      get() = _builder.getDescription()
      @JvmName("setDescription")
      set(value) {
        _builder.setDescription(value)
      }
    /**
     * <pre>
     * the description of the proposal
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    fun clearDescription() {
      _builder.clearDescription()
    }

    /**
     * <pre>
     * the client identifier for the client to be updated if the proposal passes
     * </pre>
     *
     * <code>string subject_client_id = 3 [(.gogoproto.moretags) = "yaml:&#92;"subject_client_id&#92;""];</code>
     */
    var subjectClientId: kotlin.String
      @JvmName("getSubjectClientId")
      get() = _builder.getSubjectClientId()
      @JvmName("setSubjectClientId")
      set(value) {
        _builder.setSubjectClientId(value)
      }
    /**
     * <pre>
     * the client identifier for the client to be updated if the proposal passes
     * </pre>
     *
     * <code>string subject_client_id = 3 [(.gogoproto.moretags) = "yaml:&#92;"subject_client_id&#92;""];</code>
     */
    fun clearSubjectClientId() {
      _builder.clearSubjectClientId()
    }

    /**
     * <pre>
     * the substitute client identifier for the client standing in for the subject
     * client
     * </pre>
     *
     * <code>string substitute_client_id = 4 [(.gogoproto.moretags) = "yaml:&#92;"substitute_client_id&#92;""];</code>
     */
    var substituteClientId: kotlin.String
      @JvmName("getSubstituteClientId")
      get() = _builder.getSubstituteClientId()
      @JvmName("setSubstituteClientId")
      set(value) {
        _builder.setSubstituteClientId(value)
      }
    /**
     * <pre>
     * the substitute client identifier for the client standing in for the subject
     * client
     * </pre>
     *
     * <code>string substitute_client_id = 4 [(.gogoproto.moretags) = "yaml:&#92;"substitute_client_id&#92;""];</code>
     */
    fun clearSubstituteClientId() {
      _builder.clearSubstituteClientId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun ibc.core.client.v1.Client.ClientUpdateProposal.copy(block: ibc.core.client.v1.ClientUpdateProposalKt.Dsl.() -> Unit): ibc.core.client.v1.Client.ClientUpdateProposal =
  ibc.core.client.v1.ClientUpdateProposalKt.Dsl._create(this.toBuilder()).apply { block() }._build()
