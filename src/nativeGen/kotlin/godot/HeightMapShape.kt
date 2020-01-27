// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolRealArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class HeightMapShape internal constructor(
  _handle: COpaquePointer
) : Shape(_handle) {
  fun getMapData(): PoolRealArray {
    val _ret = __method_bind.get_map_data.call(this.toVariant())
    return _ret.asPoolRealArray()
  }

  fun getMapDepth(): Int {
    val _ret = __method_bind.get_map_depth.call(this.toVariant())
    return _ret.asInt()
  }

  fun getMapWidth(): Int {
    val _ret = __method_bind.get_map_width.call(this.toVariant())
    return _ret.asInt()
  }

  fun setMapData(data: PoolRealArray) {
    val _args = VariantArray.new()
    _args.append(data)
    __method_bind.set_map_data.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setMapDepth(height: Int) {
    val _args = VariantArray.new()
    _args.append(height)
    __method_bind.set_map_depth.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setMapWidth(width: Int) {
    val _args = VariantArray.new()
    _args.append(width)
    __method_bind.set_map_width.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): HeightMapShape = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("HeightMapShape".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton HeightMapShape" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      HeightMapShape(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): HeightMapShape = HeightMapShape(ptr)
    /**
     * Container for method_bind pointers for HeightMapShape
     */
    private object __method_bind {
      val get_map_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HeightMapShape".cstr.ptr,
              "get_map_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_map_data" }
            }
          }

      val get_map_depth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HeightMapShape".cstr.ptr,
              "get_map_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_map_depth" }
            }
          }

      val get_map_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HeightMapShape".cstr.ptr,
              "get_map_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_map_width" }
            }
          }

      val set_map_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HeightMapShape".cstr.ptr,
              "set_map_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_map_data" }
            }
          }

      val set_map_depth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HeightMapShape".cstr.ptr,
              "set_map_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_map_depth" }
            }
          }

      val set_map_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HeightMapShape".cstr.ptr,
              "set_map_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_map_width" }
            }
          }
    }
  }
}
