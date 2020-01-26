// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class WebSocketMultiplayerPeer internal constructor(
  _handle: COpaquePointer
) : NetworkedMultiplayerPeer(_handle) {
  fun getPeer(peer_id: Int): WebSocketPeer {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for WebSocketMultiplayerPeer
     */
    private object __method_bind {
      val get_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketMultiplayerPeer".cstr.ptr,
              "get_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_peer" }
            }
          }
    }
  }
}
