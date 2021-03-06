// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.PoolVector3Array
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class NavigationMesh(
  _handle: COpaquePointer
) : Resource(_handle) {
  var agentHeight: Float
    get() {
       return getAgentHeight() 
    }
    set(value) {
      setAgentHeight(value)
    }

  var agentMaxClimb: Float
    get() {
       return getAgentMaxClimb() 
    }
    set(value) {
      setAgentMaxClimb(value)
    }

  var agentMaxSlope: Float
    get() {
       return getAgentMaxSlope() 
    }
    set(value) {
      setAgentMaxSlope(value)
    }

  var agentRadius: Float
    get() {
       return getAgentRadius() 
    }
    set(value) {
      setAgentRadius(value)
    }

  var cellHeight: Float
    get() {
       return getCellHeight() 
    }
    set(value) {
      setCellHeight(value)
    }

  var cellSize: Float
    get() {
       return getCellSize() 
    }
    set(value) {
      setCellSize(value)
    }

  var detailSampleDistance: Float
    get() {
       return getDetailSampleDistance() 
    }
    set(value) {
      setDetailSampleDistance(value)
    }

  var detailSampleMaxError: Float
    get() {
       return getDetailSampleMaxError() 
    }
    set(value) {
      setDetailSampleMaxError(value)
    }

  var edgeMaxError: Float
    get() {
       return getEdgeMaxError() 
    }
    set(value) {
      setEdgeMaxError(value)
    }

  var edgeMaxLength: Float
    get() {
       return getEdgeMaxLength() 
    }
    set(value) {
      setEdgeMaxLength(value)
    }

  var filterFilterWalkableLowHeightSpans: Boolean
    get() {
       return getFilterWalkableLowHeightSpans() 
    }
    set(value) {
      setFilterWalkableLowHeightSpans(value)
    }

  var filterLedgeSpans: Boolean
    get() {
       return getFilterLedgeSpans() 
    }
    set(value) {
      setFilterLedgeSpans(value)
    }

  var filterLowHangingObstacles: Boolean
    get() {
       return getFilterLowHangingObstacles() 
    }
    set(value) {
      setFilterLowHangingObstacles(value)
    }

  var geometryCollisionMask: Int
    get() {
       return getCollisionMask() 
    }
    set(value) {
      setCollisionMask(value)
    }

  var geometryParsedGeometryType: Int
    get() {
       return getParsedGeometryType() 
    }
    set(value) {
      setParsedGeometryType(value)
    }

  var geometrySourceGeometryMode: Int
    get() {
       return getSourceGeometryMode() 
    }
    set(value) {
      setSourceGeometryMode(value)
    }

  var geometrySourceGroupName: String
    get() {
       return getSourceGroupName() 
    }
    set(value) {
      setSourceGroupName(value)
    }

  var polygonVertsPerPoly: Float
    get() {
       return getVertsPerPoly() 
    }
    set(value) {
      setVertsPerPoly(value)
    }

  var regionMergeSize: Float
    get() {
       return getRegionMergeSize() 
    }
    set(value) {
      setRegionMergeSize(value)
    }

  var regionMinSize: Float
    get() {
       return getRegionMinSize() 
    }
    set(value) {
      setRegionMinSize(value)
    }

  var samplePartitionTypeSamplePartitionType: Int
    get() {
       return getSamplePartitionType() 
    }
    set(value) {
      setSamplePartitionType(value)
    }

  var vertices: PoolVector3Array
    get() {
       return getVertices() 
    }
    set(value) {
      setVertices(value)
    }

  /**
   * Specialized setter for vertices
   */
  fun vertices(cb: PoolVector3Array.() -> Unit) {
    val _p = vertices
    cb(_p)
    vertices = _p
  }

  fun addPolygon(polygon: PoolIntArray) {
    val _arg = Variant.new(polygon)
    __method_bind.addPolygon.call(this._handle, listOf(_arg))
  }

  fun clearPolygons() {
    __method_bind.clearPolygons.call(this._handle)
  }

  fun createFromMesh(mesh: Mesh) {
    val _arg = Variant.new(mesh)
    __method_bind.createFromMesh.call(this._handle, listOf(_arg))
  }

  fun getAgentHeight(): Float {
    val _ret = __method_bind.getAgentHeight.call(this._handle)
    return _ret.asFloat()
  }

  fun getAgentMaxClimb(): Float {
    val _ret = __method_bind.getAgentMaxClimb.call(this._handle)
    return _ret.asFloat()
  }

  fun getAgentMaxSlope(): Float {
    val _ret = __method_bind.getAgentMaxSlope.call(this._handle)
    return _ret.asFloat()
  }

  fun getAgentRadius(): Float {
    val _ret = __method_bind.getAgentRadius.call(this._handle)
    return _ret.asFloat()
  }

  fun getCellHeight(): Float {
    val _ret = __method_bind.getCellHeight.call(this._handle)
    return _ret.asFloat()
  }

  fun getCellSize(): Float {
    val _ret = __method_bind.getCellSize.call(this._handle)
    return _ret.asFloat()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.getCollisionMask.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.getCollisionMaskBit.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getDetailSampleDistance(): Float {
    val _ret = __method_bind.getDetailSampleDistance.call(this._handle)
    return _ret.asFloat()
  }

  fun getDetailSampleMaxError(): Float {
    val _ret = __method_bind.getDetailSampleMaxError.call(this._handle)
    return _ret.asFloat()
  }

  fun getEdgeMaxError(): Float {
    val _ret = __method_bind.getEdgeMaxError.call(this._handle)
    return _ret.asFloat()
  }

  fun getEdgeMaxLength(): Float {
    val _ret = __method_bind.getEdgeMaxLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getFilterLedgeSpans(): Boolean {
    val _ret = __method_bind.getFilterLedgeSpans.call(this._handle)
    return _ret.asBoolean()
  }

  fun getFilterLowHangingObstacles(): Boolean {
    val _ret = __method_bind.getFilterLowHangingObstacles.call(this._handle)
    return _ret.asBoolean()
  }

  fun getFilterWalkableLowHeightSpans(): Boolean {
    val _ret = __method_bind.getFilterWalkableLowHeightSpans.call(this._handle)
    return _ret.asBoolean()
  }

  fun getParsedGeometryType(): Int {
    val _ret = __method_bind.getParsedGeometryType.call(this._handle)
    return _ret.asInt()
  }

  fun getPolygon(idx: Int): PoolIntArray {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getPolygon.call(this._handle, listOf(_arg))
    return _ret.asPoolIntArray()
  }

  fun getPolygonCount(): Int {
    val _ret = __method_bind.getPolygonCount.call(this._handle)
    return _ret.asInt()
  }

  fun getRegionMergeSize(): Float {
    val _ret = __method_bind.getRegionMergeSize.call(this._handle)
    return _ret.asFloat()
  }

  fun getRegionMinSize(): Float {
    val _ret = __method_bind.getRegionMinSize.call(this._handle)
    return _ret.asFloat()
  }

  fun getSamplePartitionType(): Int {
    val _ret = __method_bind.getSamplePartitionType.call(this._handle)
    return _ret.asInt()
  }

  fun getSourceGeometryMode(): Int {
    val _ret = __method_bind.getSourceGeometryMode.call(this._handle)
    return _ret.asInt()
  }

  fun getSourceGroupName(): String {
    val _ret = __method_bind.getSourceGroupName.call(this._handle)
    return _ret.asString()
  }

  fun getVertices(): PoolVector3Array {
    val _ret = __method_bind.getVertices.call(this._handle)
    return _ret.asPoolVector3Array()
  }

  fun getVertsPerPoly(): Float {
    val _ret = __method_bind.getVertsPerPoly.call(this._handle)
    return _ret.asFloat()
  }

  fun setAgentHeight(agentHeight: Float) {
    val _arg = Variant.new(agentHeight)
    __method_bind.setAgentHeight.call(this._handle, listOf(_arg))
  }

  fun setAgentMaxClimb(agentMaxClimb: Float) {
    val _arg = Variant.new(agentMaxClimb)
    __method_bind.setAgentMaxClimb.call(this._handle, listOf(_arg))
  }

  fun setAgentMaxSlope(agentMaxSlope: Float) {
    val _arg = Variant.new(agentMaxSlope)
    __method_bind.setAgentMaxSlope.call(this._handle, listOf(_arg))
  }

  fun setAgentRadius(agentRadius: Float) {
    val _arg = Variant.new(agentRadius)
    __method_bind.setAgentRadius.call(this._handle, listOf(_arg))
  }

  fun setCellHeight(cellHeight: Float) {
    val _arg = Variant.new(cellHeight)
    __method_bind.setCellHeight.call(this._handle, listOf(_arg))
  }

  fun setCellSize(cellSize: Float) {
    val _arg = Variant.new(cellSize)
    __method_bind.setCellSize.call(this._handle, listOf(_arg))
  }

  fun setCollisionMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setCollisionMask.call(this._handle, listOf(_arg))
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bit))
    _args.add(Variant.fromAny(value))
    __method_bind.setCollisionMaskBit.call(this._handle, _args)
  }

  fun setDetailSampleDistance(detailSampleDist: Float) {
    val _arg = Variant.new(detailSampleDist)
    __method_bind.setDetailSampleDistance.call(this._handle, listOf(_arg))
  }

  fun setDetailSampleMaxError(detailSampleMaxError: Float) {
    val _arg = Variant.new(detailSampleMaxError)
    __method_bind.setDetailSampleMaxError.call(this._handle, listOf(_arg))
  }

  fun setEdgeMaxError(edgeMaxError: Float) {
    val _arg = Variant.new(edgeMaxError)
    __method_bind.setEdgeMaxError.call(this._handle, listOf(_arg))
  }

  fun setEdgeMaxLength(edgeMaxLength: Float) {
    val _arg = Variant.new(edgeMaxLength)
    __method_bind.setEdgeMaxLength.call(this._handle, listOf(_arg))
  }

  fun setFilterLedgeSpans(filterLedgeSpans: Boolean) {
    val _arg = Variant.new(filterLedgeSpans)
    __method_bind.setFilterLedgeSpans.call(this._handle, listOf(_arg))
  }

  fun setFilterLowHangingObstacles(filterLowHangingObstacles: Boolean) {
    val _arg = Variant.new(filterLowHangingObstacles)
    __method_bind.setFilterLowHangingObstacles.call(this._handle, listOf(_arg))
  }

  fun setFilterWalkableLowHeightSpans(filterWalkableLowHeightSpans: Boolean) {
    val _arg = Variant.new(filterWalkableLowHeightSpans)
    __method_bind.setFilterWalkableLowHeightSpans.call(this._handle, listOf(_arg))
  }

  fun setParsedGeometryType(geometryType: Int) {
    val _arg = Variant.new(geometryType)
    __method_bind.setParsedGeometryType.call(this._handle, listOf(_arg))
  }

  fun setRegionMergeSize(regionMergeSize: Float) {
    val _arg = Variant.new(regionMergeSize)
    __method_bind.setRegionMergeSize.call(this._handle, listOf(_arg))
  }

  fun setRegionMinSize(regionMinSize: Float) {
    val _arg = Variant.new(regionMinSize)
    __method_bind.setRegionMinSize.call(this._handle, listOf(_arg))
  }

  fun setSamplePartitionType(samplePartitionType: Int) {
    val _arg = Variant.new(samplePartitionType)
    __method_bind.setSamplePartitionType.call(this._handle, listOf(_arg))
  }

  fun setSourceGeometryMode(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setSourceGeometryMode.call(this._handle, listOf(_arg))
  }

  fun setSourceGroupName(mask: String) {
    val _arg = Variant.new(mask)
    __method_bind.setSourceGroupName.call(this._handle, listOf(_arg))
  }

  fun setVertices(vertices: PoolVector3Array) {
    val _arg = Variant.new(vertices)
    __method_bind.setVertices.call(this._handle, listOf(_arg))
  }

  fun setVertsPerPoly(vertsPerPoly: Float) {
    val _arg = Variant.new(vertsPerPoly)
    __method_bind.setVertsPerPoly.call(this._handle, listOf(_arg))
  }

  companion object {
    val PARSED_GEOMETRY_BOTH: Int = 2

    val PARSED_GEOMETRY_MESH_INSTANCES: Int = 0

    val PARSED_GEOMETRY_STATIC_COLLIDERS: Int = 1

    val SAMPLE_PARTITION_LAYERS: Int = 2

    val SAMPLE_PARTITION_MONOTONE: Int = 1

    val SAMPLE_PARTITION_WATERSHED: Int = 0

    fun new(): NavigationMesh = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NavigationMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for NavigationMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      NavigationMesh(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): NavigationMesh = NavigationMesh(ptr)
    /**
     * Container for method_bind pointers for NavigationMesh
     */
    private object __method_bind {
      val addPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "add_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_polygon" }
        }
      val clearPolygons: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "clear_polygons".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_polygons" }
        }
      val createFromMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "create_from_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_from_mesh" }
        }
      val getAgentHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_agent_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_agent_height" }
        }
      val getAgentMaxClimb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_agent_max_climb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_agent_max_climb" }
        }
      val getAgentMaxSlope: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_agent_max_slope".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_agent_max_slope" }
        }
      val getAgentRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_agent_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_agent_radius" }
        }
      val getCellHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_cell_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_height" }
        }
      val getCellSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_size" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
        }
      val getDetailSampleDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_detail_sample_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_detail_sample_distance" }
        }
      val getDetailSampleMaxError: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_detail_sample_max_error".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_detail_sample_max_error" }
        }
      val getEdgeMaxError: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_edge_max_error".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edge_max_error" }
        }
      val getEdgeMaxLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_edge_max_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edge_max_length" }
        }
      val getFilterLedgeSpans: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_filter_ledge_spans".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_filter_ledge_spans" }
        }
      val getFilterLowHangingObstacles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_filter_low_hanging_obstacles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_filter_low_hanging_obstacles" }
        }
      val getFilterWalkableLowHeightSpans: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_filter_walkable_low_height_spans".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_filter_walkable_low_height_spans" }
        }
      val getParsedGeometryType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_parsed_geometry_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parsed_geometry_type" }
        }
      val getPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygon" }
        }
      val getPolygonCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_polygon_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygon_count" }
        }
      val getRegionMergeSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_region_merge_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_region_merge_size" }
        }
      val getRegionMinSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_region_min_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_region_min_size" }
        }
      val getSamplePartitionType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_sample_partition_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sample_partition_type" }
        }
      val getSourceGeometryMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_source_geometry_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_source_geometry_mode" }
        }
      val getSourceGroupName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_source_group_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_source_group_name" }
        }
      val getVertices: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_vertices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertices" }
        }
      val getVertsPerPoly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "get_verts_per_poly".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_verts_per_poly" }
        }
      val setAgentHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_agent_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_agent_height" }
        }
      val setAgentMaxClimb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_agent_max_climb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_agent_max_climb" }
        }
      val setAgentMaxSlope: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_agent_max_slope".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_agent_max_slope" }
        }
      val setAgentRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_agent_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_agent_radius" }
        }
      val setCellHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_cell_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_height" }
        }
      val setCellSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_size" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
        }
      val setDetailSampleDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_detail_sample_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_detail_sample_distance" }
        }
      val setDetailSampleMaxError: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_detail_sample_max_error".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_detail_sample_max_error" }
        }
      val setEdgeMaxError: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_edge_max_error".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_edge_max_error" }
        }
      val setEdgeMaxLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_edge_max_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_edge_max_length" }
        }
      val setFilterLedgeSpans: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_filter_ledge_spans".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_filter_ledge_spans" }
        }
      val setFilterLowHangingObstacles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_filter_low_hanging_obstacles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_filter_low_hanging_obstacles" }
        }
      val setFilterWalkableLowHeightSpans: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_filter_walkable_low_height_spans".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_filter_walkable_low_height_spans" }
        }
      val setParsedGeometryType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_parsed_geometry_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_parsed_geometry_type" }
        }
      val setRegionMergeSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_region_merge_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_region_merge_size" }
        }
      val setRegionMinSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_region_min_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_region_min_size" }
        }
      val setSamplePartitionType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_sample_partition_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sample_partition_type" }
        }
      val setSourceGeometryMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_source_geometry_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_source_geometry_mode" }
        }
      val setSourceGroupName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_source_group_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_source_group_name" }
        }
      val setVertices: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_vertices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertices" }
        }
      val setVertsPerPoly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "set_verts_per_poly".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_verts_per_poly" }
        }}
  }
}
