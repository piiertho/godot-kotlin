// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.PoolStringArray
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

open class HTTPRequest(
  _handle: COpaquePointer
) : Node(_handle) {
  var bodySizeLimit: Int
    get() {
       return getBodySizeLimit() 
    }
    set(value) {
      setBodySizeLimit(value)
    }

  var downloadChunkSize: Int
    get() {
       return getDownloadChunkSize() 
    }
    set(value) {
      setDownloadChunkSize(value)
    }

  var downloadFile: String
    get() {
       return getDownloadFile() 
    }
    set(value) {
      setDownloadFile(value)
    }

  var maxRedirects: Int
    get() {
       return getMaxRedirects() 
    }
    set(value) {
      setMaxRedirects(value)
    }

  var timeout: Int
    get() {
       return getTimeout() 
    }
    set(value) {
      setTimeout(value)
    }

  var useThreads: Boolean
    get() {
       return isUsingThreads() 
    }
    set(value) {
      setUseThreads(value)
    }

  /**
   * HTTPRequest::request_completed signal
   */
  val signalRequestCompleted: Signal4<Int, Int, PoolStringArray, PoolByteArray> =
      Signal4("request_completed")

  fun cancelRequest() {
    __method_bind.cancelRequest.call(this._handle)
  }

  fun getBodySize(): Int {
    val _ret = __method_bind.getBodySize.call(this._handle)
    return _ret.asInt()
  }

  fun getBodySizeLimit(): Int {
    val _ret = __method_bind.getBodySizeLimit.call(this._handle)
    return _ret.asInt()
  }

  fun getDownloadChunkSize(): Int {
    val _ret = __method_bind.getDownloadChunkSize.call(this._handle)
    return _ret.asInt()
  }

  fun getDownloadFile(): String {
    val _ret = __method_bind.getDownloadFile.call(this._handle)
    return _ret.asString()
  }

  fun getDownloadedBytes(): Int {
    val _ret = __method_bind.getDownloadedBytes.call(this._handle)
    return _ret.asInt()
  }

  fun getHttpClientStatus(): HTTPClient.Status {
    val _ret = __method_bind.getHttpClientStatus.call(this._handle)
    return HTTPClient.Status.from(_ret.asInt())
  }

  fun getMaxRedirects(): Int {
    val _ret = __method_bind.getMaxRedirects.call(this._handle)
    return _ret.asInt()
  }

  fun getTimeout(): Int {
    val _ret = __method_bind.getTimeout.call(this._handle)
    return _ret.asInt()
  }

  fun isUsingThreads(): Boolean {
    val _ret = __method_bind.isUsingThreads.call(this._handle)
    return _ret.asBoolean()
  }

  fun request(
    url: String,
    customHeaders: PoolStringArray,
    sslValidateDomain: Boolean = true,
    method: Int = 0,
    requestData: String = ""
  ): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(url))
    _args.add(Variant.fromAny(customHeaders))
    _args.add(Variant.fromAny(sslValidateDomain))
    _args.add(Variant.fromAny(method))
    _args.add(Variant.fromAny(requestData))
    val _ret = __method_bind.request.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun setBodySizeLimit(bytes: Int) {
    val _arg = Variant.new(bytes)
    __method_bind.setBodySizeLimit.call(this._handle, listOf(_arg))
  }

  fun setDownloadChunkSize(arg0: Int) {
    val _arg = Variant.new(arg0)
    __method_bind.setDownloadChunkSize.call(this._handle, listOf(_arg))
  }

  fun setDownloadFile(path: String) {
    val _arg = Variant.new(path)
    __method_bind.setDownloadFile.call(this._handle, listOf(_arg))
  }

  fun setMaxRedirects(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.setMaxRedirects.call(this._handle, listOf(_arg))
  }

  fun setTimeout(timeout: Int) {
    val _arg = Variant.new(timeout)
    __method_bind.setTimeout.call(this._handle, listOf(_arg))
  }

  fun setUseThreads(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseThreads.call(this._handle, listOf(_arg))
  }

  enum class Result(
    val value: Int
  ) {
    RESULT_SUCCESS(0),

    RESULT_CHUNKED_BODY_SIZE_MISMATCH(1),

    RESULT_CANT_CONNECT(2),

    RESULT_CANT_RESOLVE(3),

    RESULT_CONNECTION_ERROR(4),

    RESULT_SSL_HANDSHAKE_ERROR(5),

    RESULT_NO_RESPONSE(6),

    RESULT_BODY_SIZE_LIMIT_EXCEEDED(7),

    RESULT_REQUEST_FAILED(8),

    RESULT_DOWNLOAD_FILE_CANT_OPEN(9),

    RESULT_DOWNLOAD_FILE_WRITE_ERROR(10),

    RESULT_REDIRECT_LIMIT_REACHED(11),

    RESULT_TIMEOUT(12);

    companion object {
      fun from(value: Int): Result {
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
    val RESULT_BODY_SIZE_LIMIT_EXCEEDED: Int = 7

    val RESULT_CANT_CONNECT: Int = 2

    val RESULT_CANT_RESOLVE: Int = 3

    val RESULT_CHUNKED_BODY_SIZE_MISMATCH: Int = 1

    val RESULT_CONNECTION_ERROR: Int = 4

    val RESULT_DOWNLOAD_FILE_CANT_OPEN: Int = 9

    val RESULT_DOWNLOAD_FILE_WRITE_ERROR: Int = 10

    val RESULT_NO_RESPONSE: Int = 6

    val RESULT_REDIRECT_LIMIT_REACHED: Int = 11

    val RESULT_REQUEST_FAILED: Int = 8

    val RESULT_SSL_HANDSHAKE_ERROR: Int = 5

    val RESULT_SUCCESS: Int = 0

    val RESULT_TIMEOUT: Int = 12

    fun new(): HTTPRequest = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("HTTPRequest".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for HTTPRequest" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      HTTPRequest(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): HTTPRequest = HTTPRequest(ptr)
    /**
     * Container for method_bind pointers for HTTPRequest
     */
    private object __method_bind {
      val cancelRequest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "cancel_request".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cancel_request" }
        }
      val getBodySize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_body_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_body_size" }
        }
      val getBodySizeLimit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_body_size_limit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_body_size_limit" }
        }
      val getDownloadChunkSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_download_chunk_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_download_chunk_size" }
        }
      val getDownloadFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_download_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_download_file" }
        }
      val getDownloadedBytes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_downloaded_bytes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_downloaded_bytes" }
        }
      val getHttpClientStatus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_http_client_status".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_http_client_status" }
        }
      val getMaxRedirects: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_max_redirects".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_redirects" }
        }
      val getTimeout: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_timeout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_timeout" }
        }
      val isUsingThreads: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "is_using_threads".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_threads" }
        }
      val request: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "request".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method request" }
        }
      val setBodySizeLimit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "set_body_size_limit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_body_size_limit" }
        }
      val setDownloadChunkSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "set_download_chunk_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_download_chunk_size" }
        }
      val setDownloadFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "set_download_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_download_file" }
        }
      val setMaxRedirects: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "set_max_redirects".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_redirects" }
        }
      val setTimeout: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "set_timeout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_timeout" }
        }
      val setUseThreads: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "set_use_threads".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_threads" }
        }}
  }
}
