function(prepend var)
  set(listVar "")
  foreach(f ${ARGN})
    list(APPEND listVar "${CMAKE_CURRENT_SOURCE_DIR}/${f}")
  endforeach(f)
  set(${var} "${listVar}" PARENT_SCOPE)
endfunction(prepend)

#file(GLOB AST_HEADERS
#  RELATIVE ${CMAKE_CURRENT_SOURCE_DIR}
#  "ast/*.h"
#  )

#file(GLOB X3D_HEADERS
#  RELATIVE ${CMAKE_CURRENT_SOURCE_DIR}
#  "x3d/*.h"
#  )

#message("configuring file ... ")
#configure_file(.h.in c_config.h)

set(CARBON_INCLUDE_DIRS
  ${CMAKE_CURRENT_BINARY_DIR}
  ${CMAKE_CURRENT_SOURCE_DIR}
  )

# message("mx config file: ${CMAKE_CURRENT_BINARY_DIR}/mx_config.h")

set (_PUBLIC_HEADERS
  carbon.h
  c_port.h
  c_object.h
  c_object.hpp
  c_type.h
  c_descrobject.h
  c_listwrap.h
  c_event.h
  c_error.h
  c_compartment.h
  c_kineticlaw.h
  c_reaction.h
  c_species.h
  c_speciesreference.h
  c_util.h
  CLogger.hpp
  )

message("_PUBLIC_HEADERS: ${_PUBLIC_HEADERS}")

prepend(PUBLIC_HEADERS  ${_PUBLIC_HEADERS})

set(CARBON_PUBLIC_HEADERS ${PUBLIC_HEADERS} PARENT_SCOPE)

set(CARBON_INCLUDE_DIRS ${CARBON_INCLUDE_DIRS} PARENT_SCOPE)
