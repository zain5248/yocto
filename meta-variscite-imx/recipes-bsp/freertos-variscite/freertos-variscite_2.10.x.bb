# Copyright (C) 2021 Variscite
include freertos-variscite.inc

SRCREV = "c385b5d4bb0f6e47af955e619df39c1ae09ed7fc"
# See https://github.com/varigit/freertos-variscite/blob/mcuxpresso_sdk_2.10.x-var01/docs/MCUXpresso%20SDK%20Release%20Notes%20for%20EVK-MIMX8MN.pdf
# "Development Tools" section for supported GCC version
CM_GCC = "gcc-arm-none-eabi-10-2020-q4-major"

SRC_URI += " \
    git://github.com/varigit/freertos-variscite.git;protocol=git;branch=${MCUXPRESSO_BRANCH}; \
    https://developer.arm.com/-/media/Files/downloads/gnu-rm/10-2020q4/gcc-arm-none-eabi-10-2020-q4-major-x86_64-linux.tar.bz2;name=gcc-arm-none-eabi-10-2020-q4-major \
"

SRC_URI[gcc-arm-none-eabi-10-2020-q4-major.sha256sum] = "21134caa478bbf5352e239fbc6e2da3038f8d2207e089efc96c3b55f1edcd618"

COMPATIBLE_MACHINE = "(imx8mp-var-dart)"
