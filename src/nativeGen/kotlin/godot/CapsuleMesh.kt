// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CapsuleMesh internal constructor(
  _handle: COpaquePointer
) : PrimitiveMesh(_handle) {
  fun getMidHeight(): Float {
    val _ret = __method_bind.get_mid_height.call(this.toVariant())
    TODO()
  }

  fun getRadialSegments(): Int {
    val _ret = __method_bind.get_radial_segments.call(this.toVariant())
    TODO()
  }

  fun getRadius(): Float {
    val _ret = __method_bind.get_radius.call(this.toVariant())
    TODO()
  }

  fun getRings(): Int {
    val _ret = __method_bind.get_rings.call(this.toVariant())
    TODO()
  }

  fun setMidHeight(midHeight: Float) {
    val _args = VariantArray.new()
    _args.append(midHeight)
    val _ret = __method_bind.set_mid_height.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setRadialSegments(segments: Int) {
    val _args = VariantArray.new()
    _args.append(segments)
    val _ret = __method_bind.set_radial_segments.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setRadius(radius: Float) {
    val _args = VariantArray.new()
    _args.append(radius)
    val _ret = __method_bind.set_radius.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setRings(rings: Int) {
    val _args = VariantArray.new()
    _args.append(rings)
    val _ret = __method_bind.set_rings.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): CapsuleMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CapsuleMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CapsuleMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CapsuleMesh(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CapsuleMesh = CapsuleMesh(ptr)
    /**
     * Container for method_bind pointers for CapsuleMesh
     */
    private object __method_bind {
      val get_mid_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
              "get_mid_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mid_height" }
            }
          }

      val get_radial_segments: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
              "get_radial_segments".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_radial_segments" }
            }
          }

      val get_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
              "get_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_radius" }
            }
          }

      val get_rings: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
              "get_rings".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rings" }
            }
          }

      val set_mid_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
              "set_mid_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mid_height" }
            }
          }

      val set_radial_segments: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
              "set_radial_segments".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_radial_segments" }
            }
          }

      val set_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
              "set_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_radius" }
            }
          }

      val set_rings: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
              "set_rings".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rings" }
            }
          }
    }
  }
}
