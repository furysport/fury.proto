//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/evidence/v1beta1/query.proto

package cosmos.evidence.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryAllEvidenceResponse(block: cosmos.evidence.v1beta1.QueryAllEvidenceResponseKt.Dsl.() -> Unit): cosmos.evidence.v1beta1.QueryOuterClass.QueryAllEvidenceResponse =
  cosmos.evidence.v1beta1.QueryAllEvidenceResponseKt.Dsl._create(cosmos.evidence.v1beta1.QueryOuterClass.QueryAllEvidenceResponse.newBuilder()).apply { block() }._build()
object QueryAllEvidenceResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.evidence.v1beta1.QueryOuterClass.QueryAllEvidenceResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.evidence.v1beta1.QueryOuterClass.QueryAllEvidenceResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.evidence.v1beta1.QueryOuterClass.QueryAllEvidenceResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class EvidenceProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * evidence returns all evidences.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any evidence = 1;</code>
     */
     val evidence: com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, EvidenceProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getEvidenceList()
      )
    /**
     * <pre>
     * evidence returns all evidences.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any evidence = 1;</code>
     * @param value The evidence to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addEvidence")
    fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, EvidenceProxy>.add(value: com.google.protobuf.Any) {
      _builder.addEvidence(value)
    }/**
     * <pre>
     * evidence returns all evidences.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any evidence = 1;</code>
     * @param value The evidence to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignEvidence")
    inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, EvidenceProxy>.plusAssign(value: com.google.protobuf.Any) {
      add(value)
    }/**
     * <pre>
     * evidence returns all evidences.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any evidence = 1;</code>
     * @param values The evidence to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllEvidence")
    fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, EvidenceProxy>.addAll(values: kotlin.collections.Iterable<com.google.protobuf.Any>) {
      _builder.addAllEvidence(values)
    }/**
     * <pre>
     * evidence returns all evidences.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any evidence = 1;</code>
     * @param values The evidence to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllEvidence")
    inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, EvidenceProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.protobuf.Any>) {
      addAll(values)
    }/**
     * <pre>
     * evidence returns all evidences.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any evidence = 1;</code>
     * @param index The index to set the value at.
     * @param value The evidence to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setEvidence")
    operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, EvidenceProxy>.set(index: kotlin.Int, value: com.google.protobuf.Any) {
      _builder.setEvidence(index, value)
    }/**
     * <pre>
     * evidence returns all evidences.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any evidence = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearEvidence")
    fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, EvidenceProxy>.clear() {
      _builder.clearEvidence()
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    var pagination: cosmos.base.query.v1beta1.Pagination.PageResponse
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     * @return Whether the pagination field is set.
     */
    fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.evidence.v1beta1.QueryOuterClass.QueryAllEvidenceResponse.copy(block: cosmos.evidence.v1beta1.QueryAllEvidenceResponseKt.Dsl.() -> Unit): cosmos.evidence.v1beta1.QueryOuterClass.QueryAllEvidenceResponse =
  cosmos.evidence.v1beta1.QueryAllEvidenceResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
