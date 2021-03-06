// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Godot
import godot.core.PoolVector3Array
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Mesh(
  _handle: COpaquePointer
) : Resource(_handle) {
  var lightmapSizeHint: Vector2
    get() {
       return getLightmapSizeHint() 
    }
    set(value) {
      setLightmapSizeHint(value)
    }

  /**
   * Specialized setter for lightmapSizeHint
   */
  fun lightmapSizeHint(cb: Vector2.() -> Unit) {
    val _p = lightmapSizeHint
    cb(_p)
    lightmapSizeHint = _p
  }

  fun createConvexShape(): Shape {
    val _ret = __method_bind.createConvexShape.call(this._handle)
    return _ret.asObject(::Shape)!!
  }

  fun createOutline(margin: Float): Mesh {
    val _arg = Variant.new(margin)
    val _ret = __method_bind.createOutline.call(this._handle, listOf(_arg))
    return _ret.asObject(::Mesh)!!
  }

  fun createTrimeshShape(): Shape {
    val _ret = __method_bind.createTrimeshShape.call(this._handle)
    return _ret.asObject(::Shape)!!
  }

  fun generateTriangleMesh(): TriangleMesh {
    val _ret = __method_bind.generateTriangleMesh.call(this._handle)
    return _ret.asObject(::TriangleMesh)!!
  }

  fun getAabb(): AABB {
    val _ret = __method_bind.getAabb.call(this._handle)
    return _ret.asAABB()
  }

  fun getFaces(): PoolVector3Array {
    val _ret = __method_bind.getFaces.call(this._handle)
    return _ret.asPoolVector3Array()
  }

  fun getLightmapSizeHint(): Vector2 {
    val _ret = __method_bind.getLightmapSizeHint.call(this._handle)
    return _ret.asVector2()
  }

  fun getSurfaceCount(): Int {
    val _ret = __method_bind.getSurfaceCount.call(this._handle)
    return _ret.asInt()
  }

  fun setLightmapSizeHint(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.setLightmapSizeHint.call(this._handle, listOf(_arg))
  }

  fun surfaceGetArrays(surfIdx: Int): VariantArray {
    val _arg = Variant.new(surfIdx)
    val _ret = __method_bind.surfaceGetArrays.call(this._handle, listOf(_arg))
    return _ret.asVariantArray()
  }

  fun surfaceGetBlendShapeArrays(surfIdx: Int): VariantArray {
    val _arg = Variant.new(surfIdx)
    val _ret = __method_bind.surfaceGetBlendShapeArrays.call(this._handle, listOf(_arg))
    return _ret.asVariantArray()
  }

  fun surfaceGetMaterial(surfIdx: Int): Material {
    val _arg = Variant.new(surfIdx)
    val _ret = __method_bind.surfaceGetMaterial.call(this._handle, listOf(_arg))
    return _ret.asObject(::Material)!!
  }

  fun surfaceSetMaterial(surfIdx: Int, material: Material) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(surfIdx))
    _args.add(Variant.fromAny(material))
    __method_bind.surfaceSetMaterial.call(this._handle, _args)
  }

  enum class BlendShapeMode(
    val value: Int
  ) {
    BLEND_SHAPE_MODE_NORMALIZED(0),

    BLEND_SHAPE_MODE_RELATIVE(1);

    companion object {
      fun from(value: Int): BlendShapeMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class PrimitiveType(
    val value: Int
  ) {
    PRIMITIVE_POINTS(0),

    PRIMITIVE_LINES(1),

    PRIMITIVE_LINE_STRIP(2),

    PRIMITIVE_LINE_LOOP(3),

    PRIMITIVE_TRIANGLES(4),

    PRIMITIVE_TRIANGLE_STRIP(5),

    PRIMITIVE_TRIANGLE_FAN(6);

    companion object {
      fun from(value: Int): PrimitiveType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ArrayFormat(
    val value: Int
  ) {
    ARRAY_FORMAT_VERTEX(1),

    ARRAY_FORMAT_NORMAL(2),

    ARRAY_FORMAT_TANGENT(4),

    ARRAY_FORMAT_COLOR(8),

    ARRAY_COMPRESS_BASE(9),

    ARRAY_FORMAT_TEX_UV(16),

    ARRAY_FORMAT_TEX_UV2(32),

    ARRAY_FORMAT_BONES(64),

    ARRAY_FORMAT_WEIGHTS(128),

    ARRAY_FORMAT_INDEX(256),

    ARRAY_COMPRESS_VERTEX(512),

    ARRAY_COMPRESS_NORMAL(1024),

    ARRAY_COMPRESS_TANGENT(2048),

    ARRAY_COMPRESS_COLOR(4096),

    ARRAY_COMPRESS_TEX_UV(8192),

    ARRAY_COMPRESS_TEX_UV2(16384),

    ARRAY_COMPRESS_BONES(32768),

    ARRAY_COMPRESS_WEIGHTS(65536),

    ARRAY_COMPRESS_DEFAULT(97280),

    ARRAY_COMPRESS_INDEX(131072),

    ARRAY_FLAG_USE_2D_VERTICES(262144),

    ARRAY_FLAG_USE_16_BIT_BONES(524288);

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

    val ARRAY_COMPRESS_BASE: Int = 9

    val ARRAY_COMPRESS_BONES: Int = 32768

    val ARRAY_COMPRESS_COLOR: Int = 4096

    val ARRAY_COMPRESS_DEFAULT: Int = 97280

    val ARRAY_COMPRESS_INDEX: Int = 131072

    val ARRAY_COMPRESS_NORMAL: Int = 1024

    val ARRAY_COMPRESS_TANGENT: Int = 2048

    val ARRAY_COMPRESS_TEX_UV: Int = 8192

    val ARRAY_COMPRESS_TEX_UV2: Int = 16384

    val ARRAY_COMPRESS_VERTEX: Int = 512

    val ARRAY_COMPRESS_WEIGHTS: Int = 65536

    val ARRAY_FLAG_USE_16_BIT_BONES: Int = 524288

    val ARRAY_FLAG_USE_2D_VERTICES: Int = 262144

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

    val BLEND_SHAPE_MODE_NORMALIZED: Int = 0

    val BLEND_SHAPE_MODE_RELATIVE: Int = 1

    val PRIMITIVE_LINES: Int = 1

    val PRIMITIVE_LINE_LOOP: Int = 3

    val PRIMITIVE_LINE_STRIP: Int = 2

    val PRIMITIVE_POINTS: Int = 0

    val PRIMITIVE_TRIANGLES: Int = 4

    val PRIMITIVE_TRIANGLE_FAN: Int = 6

    val PRIMITIVE_TRIANGLE_STRIP: Int = 5

    /**
     * Container for method_bind pointers for Mesh
     */
    private object __method_bind {
      val createConvexShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "create_convex_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_convex_shape" }
        }
      val createOutline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "create_outline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_outline" }
        }
      val createTrimeshShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "create_trimesh_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_trimesh_shape" }
        }
      val generateTriangleMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "generate_triangle_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generate_triangle_mesh" }
        }
      val getAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "get_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_aabb" }
        }
      val getFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "get_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_faces" }
        }
      val getLightmapSizeHint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "get_lightmap_size_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lightmap_size_hint" }
        }
      val getSurfaceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "get_surface_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_surface_count" }
        }
      val setLightmapSizeHint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "set_lightmap_size_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lightmap_size_hint" }
        }
      val surfaceGetArrays: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "surface_get_arrays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_get_arrays" }
        }
      val surfaceGetBlendShapeArrays: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "surface_get_blend_shape_arrays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_get_blend_shape_arrays" }
        }
      val surfaceGetMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "surface_get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_get_material" }
        }
      val surfaceSetMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "surface_set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_set_material" }
        }}
  }
}
