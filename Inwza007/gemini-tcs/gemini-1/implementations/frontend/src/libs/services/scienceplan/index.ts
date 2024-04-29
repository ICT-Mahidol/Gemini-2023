import { fetchers } from '@/libs/fetchers'
import { SciencePlan } from '@/libs/types/SciencePlan'
import { useMutation } from '@tanstack/react-query'
export class SciencePlanService {
  static async createSciencePlan(data: SciencePlan) {
    await fetchers.Post(`/v1/score/admin/update`, {
      form: {
        planNo: data.planNo,
        creator: data.creator,
        submitter: data.submitter,
        fundingInUSD: data.fundingInUSD,
        objectives: data.objectives,
        starSystem: data.starSystem,
        startDate: data.startDate,
        endDate: data.endDate,
        telescopeLocation: data.telescopeLocation,
        dataProcRequirements: [],
        status: 'SAVED'
      },
    })
  }
}
