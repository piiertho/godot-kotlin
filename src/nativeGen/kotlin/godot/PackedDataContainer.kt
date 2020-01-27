// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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

open class PackedDataContainer internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun pack(value: Variant): Error {
    val _args = VariantArray.new()
    _args.append(value)
    val _ret = __method_bind.pack.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun size(): Int {
    val _ret = __method_bind.size.call(this.toVariant())
    TODO()
  }

  companion object {
    fun new(): PackedDataContainer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("PackedDataContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton PackedDataContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PackedDataContainer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PackedDataContainer = PackedDataContainer(ptr)
    /**
     * Container for method_bind pointers for PackedDataContainer
     */
    private object __method_bind {
      val pack: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedDataContainer".cstr.ptr,
              "pack".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method pack" }
            }
          }

      val size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedDataContainer".cstr.ptr,
              "size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method size" }
            }
          }
    }
  }
}
