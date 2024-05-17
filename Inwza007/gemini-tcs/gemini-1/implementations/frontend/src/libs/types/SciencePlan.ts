interface DataProcessingRequirement {
  fileType: string
  fileQuality: string
  colorType: string
  contrast: number
  brightness: number
  saturation: number
  highlights: number
  exposure: number
  shadows: number
  whites: number
  blacks: number
  luminance: number
  hue: number
}

export interface SciencePlan {
  planNo: number
  creator: string
  submitter: string
  fundingInUSD: number
  objectives: string
  starSystem: string
  startDate: string
  endDate: string
  telescopeLocation: string
  dataProcRequirements: DataProcessingRequirement[]
  status: string
}
