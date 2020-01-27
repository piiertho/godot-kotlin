// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class WorldEnvironment internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun getEnvironment(): Environment {
    val _ret = __method_bind.get_environment.call(this.toVariant())
    return _ret.asObject(::Environment)!!
  }

  fun setEnvironment(env: Environment) {
    val _args = VariantArray.new()
    _args.append(env)
    __method_bind.set_environment.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): WorldEnvironment = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("WorldEnvironment".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton WorldEnvironment" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      WorldEnvironment(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): WorldEnvironment = WorldEnvironment(ptr)
    /**
     * Container for method_bind pointers for WorldEnvironment
     */
    private object __method_bind {
      val get_environment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WorldEnvironment".cstr.ptr,
              "get_environment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_environment" }
            }
          }

      val set_environment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WorldEnvironment".cstr.ptr,
              "set_environment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_environment" }
            }
          }
    }
  }
}
