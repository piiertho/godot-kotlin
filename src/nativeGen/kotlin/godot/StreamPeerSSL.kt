// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class StreamPeerSSL(
  _handle: COpaquePointer
) : StreamPeer(_handle) {
  var blockingHandshake: Boolean
    get() {
       return isBlockingHandshakeEnabled() 
    }
    set(value) {
      setBlockingHandshakeEnabled(value)
    }

  fun acceptStream(
    stream: StreamPeer,
    privateKey: CryptoKey,
    certificate: X509Certificate,
    chain: X509Certificate
  ): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(stream))
    _args.add(Variant.fromAny(privateKey))
    _args.add(Variant.fromAny(certificate))
    _args.add(Variant.fromAny(chain))
    val _ret = __method_bind.acceptStream.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun connectToStream(
    stream: StreamPeer,
    validateCerts: Boolean = false,
    forHostname: String = "",
    validCertificate: X509Certificate
  ): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(stream))
    _args.add(Variant.fromAny(validateCerts))
    _args.add(Variant.fromAny(forHostname))
    _args.add(Variant.fromAny(validCertificate))
    val _ret = __method_bind.connectToStream.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun disconnectFromStream() {
    __method_bind.disconnectFromStream.call(this._handle)
  }

  fun getStatus(): Status {
    val _ret = __method_bind.getStatus.call(this._handle)
    return StreamPeerSSL.Status.from(_ret.asInt())
  }

  fun isBlockingHandshakeEnabled(): Boolean {
    val _ret = __method_bind.isBlockingHandshakeEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun poll() {
    __method_bind.poll.call(this._handle)
  }

  fun setBlockingHandshakeEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setBlockingHandshakeEnabled.call(this._handle, listOf(_arg))
  }

  enum class Status(
    val value: Int
  ) {
    STATUS_DISCONNECTED(0),

    STATUS_HANDSHAKING(1),

    STATUS_CONNECTED(2),

    STATUS_ERROR(3),

    STATUS_ERROR_HOSTNAME_MISMATCH(4);

    companion object {
      fun from(value: Int): Status {
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
    val STATUS_CONNECTED: Int = 2

    val STATUS_DISCONNECTED: Int = 0

    val STATUS_ERROR: Int = 3

    val STATUS_ERROR_HOSTNAME_MISMATCH: Int = 4

    val STATUS_HANDSHAKING: Int = 1

    fun new(): StreamPeerSSL = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StreamPeerSSL".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for StreamPeerSSL" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StreamPeerSSL(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): StreamPeerSSL = StreamPeerSSL(ptr)
    /**
     * Container for method_bind pointers for StreamPeerSSL
     */
    private object __method_bind {
      val acceptStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
            "accept_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method accept_stream" }
        }
      val connectToStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
            "connect_to_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_to_stream" }
        }
      val disconnectFromStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
            "disconnect_from_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnect_from_stream" }
        }
      val getStatus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
            "get_status".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_status" }
        }
      val isBlockingHandshakeEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
            "is_blocking_handshake_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_blocking_handshake_enabled" }
        }
      val poll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
            "poll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method poll" }
        }
      val setBlockingHandshakeEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
            "set_blocking_handshake_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_blocking_handshake_enabled" }
        }}
  }
}
