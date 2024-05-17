import { Box, Text, Flex } from '@chakra-ui/react'
import Link from 'next/link'
import React, { useState } from 'react'
import { SciencePlan } from '@/libs/types/SciencePlan'

interface SPCardProps {
  data: SciencePlan
}

const formatColor = (status: string) => {
  switch (status) {
    case 'SAVED':
      return '#4CC6ED'
    case 'TESTED':
      return '#66BD50'
    default:
      return 'gray'
  }
}

export const SPcard = (props: SPCardProps) => {
  return (
    <Link href={`/SciencePlan/${props.data.planNo}`}>
      <Flex
        w="full"
        bg="white"
        h="100px"
        rounded="2xl"
        p={3}
        alignItems="center"
        justifyContent="center"
        gap={10}
      >
        <Box
          display="flex"
          w="70px"
          h="70px"
          bg="#1F6B8B"
          justifyContent="center"
          alignItems="center"
          fontWeight="bold"
          fontSize="xl"
          rounded="xl"
        >
          {props.data.planNo}
        </Box>
        <Text w="400px" color="black" fontWeight="bold">
          {props.data.creator}
        </Text>
        <Text w="250px" color="black">
          {props.data.startDate}
        </Text>
        <Text
          ml={10}
          w="130px"
          bg={formatColor(props.data.status)}
          fontWeight="bold"
          py={2}
          px={4}
          rounded="30px"
          fontSize="small"
          textAlign="center"
        >
          {props.data.status}
        </Text>
      </Flex>
    </Link>
  )
}
