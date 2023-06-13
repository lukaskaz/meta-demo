SUMMARY = "Sample application service"
DESCRIPTION = "This is a simple Hello World recipe - uses a local source file"
HOMEPAGE = "https://github.com/lukaskaz/obmc-sample-app"
LICENSE = "CLOSED"

DEPENDS = "boost \
           gtest \
           nlohmann-json \
           phosphor-logging \
           sdbusplus \
           systemd"
RDEPENDS_${PN} = "boost-system boost-thread boost-program-options boost-container"

#SRCREV = "48b459c232f8a5bd549b2afe38c409bb55c8ea33"
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
SRC_URI = "git://github.com/lukaskaz/obmc-sample-app.git;branch=main;protocol=https"
S = "${WORKDIR}/git"
SYSTEMD_SERVICE:${PN} = "xyz.openbmc_project.demoApp.service"

inherit pkgconfig cmake
inherit systemd

EXTRA_OECMAKE = ""

