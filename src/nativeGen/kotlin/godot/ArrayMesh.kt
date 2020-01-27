// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ArrayMesh internal constructor(
  _handle: COpaquePointer
) : Mesh(_handle) {
  fun addBlendShape(name: String) {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.add_blend_shape.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun addSurfaceFromArrays(
    primitive: Int,
    arrays: VariantArray,
    blendShapes: VariantArray,
    compressFlags: Int
  ) {
    val _args = VariantArray.new()
    _args.append(primitive)
    _args.append(arrays)
    _args.append(blendShapes)
    _args.append(compressFlags)
    val _ret = __method_bind.add_surface_from_arrays.call(this.toVariant(), _args.toVariant(), 4)
    TODO()
  }

  fun clearBlendShapes() {
    val _ret = __method_bind.clear_blend_shapes.call(this.toVariant())
    TODO()
  }

  fun getBlendShapeCount(): Int {
    val _ret = __method_bind.get_blend_shape_count.call(this.toVariant())
    TODO()
  }

  fun getBlendShapeMode(): Mesh.BlendShapeMode {
    val _ret = __method_bind.get_blend_shape_mode.call(this.toVariant())
    TODO()
  }

  fun getBlendShapeName(index: Int): String {
    val _args = VariantArray.new()
    _args.append(index)
    val _ret = __method_bind.get_blend_shape_name.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getCustomAabb(): AABB {
    val _ret = __method_bind.get_custom_aabb.call(this.toVariant())
    TODO()
  }

  fun lightmapUnwrap(transform: Transform, texelSize: Float): Error {
    val _args = VariantArray.new()
    _args.append(transform)
    _args.append(texelSize)
    val _ret = __method_bind.lightmap_unwrap.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun regenNormalmaps() {
    val _ret = __method_bind.regen_normalmaps.call(this.toVariant())
    TODO()
  }

  fun setBlendShapeMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    val _ret = __method_bind.set_blend_shape_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setCustomAabb(aabb: AABB) {
    val _args = VariantArray.new()
    _args.append(aabb)
    val _ret = __method_bind.set_custom_aabb.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun surfaceFindByName(name: String): Int {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.surface_find_by_name.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun surfaceGetArrayIndexLen(surfIdx: Int): Int {
    val _args = VariantArray.new()
    _args.append(surfIdx)
    val _ret = __method_bind.surface_get_array_index_len.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun surfaceGetArrayLen(surfIdx: Int): Int {
    val _args = VariantArray.new()
    _args.append(surfIdx)
    val _ret = __method_bind.surface_get_array_len.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun surfaceGetFormat(surfIdx: Int): Int {
    val _args = VariantArray.new()
    _args.append(surfIdx)
    val _ret = __method_bind.surface_get_format.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun surfaceGetName(surfIdx: Int): String {
    val _args = VariantArray.new()
    _args.append(surfIdx)
    val _ret = __method_bind.surface_get_name.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun surfaceGetPrimitiveType(surfIdx: Int): Mesh.PrimitiveType {
    val _args = VariantArray.new()
    _args.append(surfIdx)
    val _ret = __method_bind.surface_get_primitive_type.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun surfaceRemove(surfIdx: Int) {
    val _args = VariantArray.new()
    _args.append(surfIdx)
    val _ret = __method_bind.surface_remove.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun surfaceSetName(surfIdx: Int, name: String) {
    val _args = VariantArray.new()
    _args.append(surfIdx)
    _args.append(name)
    val _ret = __method_bind.surface_set_name.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun surfaceUpdateRegion(
    surfIdx: Int,
    offset: Int,
    data: PoolByteArray
  ) {
    val _args = VariantArray.new()
    _args.append(surfIdx)
    _args.append(offset)
    _args.append(data)
    val _ret = __method_bind.surface_update_region.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  enum class ArrayFormat(
    val value: Int
  ) {
    ARRAY_FORMAT_VERTEX(1),

    ARRAY_FORMAT_NORMAL(2),

    ARRAY_FORMAT_TANGENT(4),

    ARRAY_FORMAT_COLOR(8),

    ARRAY_FORMAT_TEX_UV(16),

    ARRAY_FORMAT_TEX_UV2(32),

    ARRAY_FORMAT_BONES(64),

    ARRAY_FORMAT_WEIGHTS(128),

    ARRAY_FORMAT_INDEX(256);

    companion object {
      fun from(value: Int): ArrayFormat {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ArrayType(
    val value: Int
  ) {
    ARRAY_VERTEX(0),

    ARRAY_NORMAL(1),

    ARRAY_TANGENT(2),

    ARRAY_COLOR(3),

    ARRAY_TEX_UV(4),

    ARRAY_TEX_UV2(5),

    ARRAY_BONES(6),

    ARRAY_WEIGHTS(7),

    ARRAY_INDEX(8),

    ARRAY_MAX(9);

    companion object {
      fun from(value: Int): ArrayType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val ARRAY_BONES: Int = 6

    val ARRAY_COLOR: Int = 3

    val ARRAY_FORMAT_BONES: Int = 64

    val ARRAY_FORMAT_COLOR: Int = 8

    val ARRAY_FORMAT_INDEX: Int = 256

    val ARRAY_FORMAT_NORMAL: Int = 2

    val ARRAY_FORMAT_TANGENT: Int = 4

    val ARRAY_FORMAT_TEX_UV: Int = 16

    val ARRAY_FORMAT_TEX_UV2: Int = 32

    val ARRAY_FORMAT_VERTEX: Int = 1

    val ARRAY_FORMAT_WEIGHTS: Int = 128

    val ARRAY_INDEX: Int = 8

    val ARRAY_MAX: Int = 9

    val ARRAY_NORMAL: Int = 1

    val ARRAY_TANGENT: Int = 2

    val ARRAY_TEX_UV: Int = 4

    val ARRAY_TEX_UV2: Int = 5

    val ARRAY_VERTEX: Int = 0

    val ARRAY_WEIGHTS: Int = 7

    val ARRAY_WEIGHTS_SIZE: Int = 4

    val NO_INDEX_ARRAY: Int = -1

    fun new(): ArrayMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ArrayMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ArrayMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ArrayMesh(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ArrayMesh = ArrayMesh(ptr)
    /**
     * Container for method_bind pointers for ArrayMesh
     */
    private object __method_bind {
      val add_blend_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "add_blend_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_blend_shape" }
            }
          }

      val add_surface_from_arrays: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "add_surface_from_arrays".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_surface_from_arrays" }
            }
          }

      val clear_blend_shapes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "clear_blend_shapes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_blend_shapes" }
            }
          }

      val get_blend_shape_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "get_blend_shape_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_shape_count" }
            }
          }

      val get_blend_shape_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "get_blend_shape_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_shape_mode" }
            }
          }

      val get_blend_shape_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "get_blend_shape_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_shape_name" }
            }
          }

      val get_custom_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "get_custom_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_aabb" }
            }
          }

      val lightmap_unwrap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "lightmap_unwrap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method lightmap_unwrap" }
            }
          }

      val regen_normalmaps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "regen_normalmaps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method regen_normalmaps" }
            }
          }

      val set_blend_shape_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "set_blend_shape_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blend_shape_mode" }
            }
          }

      val set_custom_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "set_custom_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_aabb" }
            }
          }

      val surface_find_by_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "surface_find_by_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method surface_find_by_name" }
            }
          }

      val surface_get_array_index_len: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "surface_get_array_index_len".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method surface_get_array_index_len" }
            }
          }

      val surface_get_array_len: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "surface_get_array_len".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method surface_get_array_len" }
            }
          }

      val surface_get_format: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "surface_get_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method surface_get_format" }
            }
          }

      val surface_get_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "surface_get_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method surface_get_name" }
            }
          }

      val surface_get_primitive_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "surface_get_primitive_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method surface_get_primitive_type" }
            }
          }

      val surface_remove: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "surface_remove".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method surface_remove" }
            }
          }

      val surface_set_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "surface_set_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method surface_set_name" }
            }
          }

      val surface_update_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
              "surface_update_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method surface_update_region" }
            }
          }
    }
  }
}
